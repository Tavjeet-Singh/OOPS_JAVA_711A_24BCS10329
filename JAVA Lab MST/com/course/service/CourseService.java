package com.course.service;
import com.course.model.*;
import com.course.exception.*;
import java.util.*;
import java.io.*;

public class CourseService{
    private List<Course> courses;

    public CourseService(){
        this.courses = new ArrayList<>();
    }
    public void addCourse(Course c){
        courses.add(c);
        System.out.println("Course added !!");
    }
    public void enrollStudent(int courseId, Student student) throws CourseFullException, CourseNotFoundException, DuplicateEnrollmentException {
        Course foundCourse = null;
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                foundCourse = course;
                break;
            }
        }
        if (foundCourse == null) {
            throw new CourseNotFoundException("Course not found!");
        }
        for (Student s : foundCourse.getEnrolledStudents()) {
            if (s.getStudentId() == student.getStudentId()) {
                throw new DuplicateEnrollmentException("Student already enrolled!");
            }
        }
        if (foundCourse.getEnrolledStudents().size() >= foundCourse.getMaxSeats()) {
            throw new CourseFullException("Course is full!");
        }
        foundCourse.getEnrolledStudents().add(student);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("courses.txt", true));

            bw.write(foundCourse.getCourseId() + "," +
                     foundCourse.getCourseName() + "," +
                     student.getStudentId() + "," +
                     student.getStudentName());
            bw.newLine();
            bw.close();
        } 
        catch (IOException e) {
            System.out.println("File writing error.");
        }
        System.out.println("Student enrolled successfully!");
    }
    
    public void viewCourses(){
        for (Course course : courses){
            course.displayCourseDetails();
        }
    }
}