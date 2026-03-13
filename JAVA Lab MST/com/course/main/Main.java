package com.course.main;
import com.course.model.*;
import com.course.service.*;
import com.course.exception.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CourseService service = new CourseService();
        service.addCourse(new Course(101,"Java",2));
        service.addCourse(new Course(102,"DSA",3));
        while(true){
            System.out.println("\n1. Enroll Student");
            System.out.println("2. View Courses");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            try{
                if(choice == 1){
                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    Student s = new Student(sid,name);
                    service.enrollStudent(cid,s);
                }
                else if(choice == 2){
                    service.viewCourses();
                }
                else if(choice == 3){
                    break;
                }
                else{
                    System.out.println("Invalid choice!");
                }
            }
            catch(CourseFullException |
                  CourseNotFoundException |
                  DuplicateEnrollmentException e){
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}