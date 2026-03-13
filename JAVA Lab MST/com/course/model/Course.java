package com.course.model;
import java.util.*;
public class Course{
    private int courseId;
    private String courseName;
    private int maxSeats;
    private List<Student> enrolledStudents;

    public Course(int courseId, String courseName, int maxSeats){
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxSeats = maxSeats;
        this.enrolledStudents = new ArrayList<>();
    }

    public int getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getMaxSeats(){
        return maxSeats;
    }
    public List<Student> getEnrolledStudents(){
        return enrolledStudents;
    }
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setMaxSeats(int maxSeats){
        this.maxSeats = maxSeats;
    }
    public void setEnrolledStudents(List<Student> enrolledStudents){
        this.enrolledStudents = enrolledStudents;
    }
    public void displayCourseDetails(){
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Max Seats: " + maxSeats);
        System.out.println("Total Enrolled Students: " + enrolledStudents.size());
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents){
            student.displayStudentDetails();
        }
    }
}