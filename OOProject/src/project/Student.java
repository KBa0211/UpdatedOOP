package project;

import java.util.ArrayList;
import java.util.List;

public class Student  extends User {
    private List<String> courses;
    private List<Teacher> teachers;


    public Student(String name, String password) {
        super(name, password);
        this.courses = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void viewCourses() {
        System.out.println("Courses registered: " + courses);
    }
    public void registerCourse(String course) {
        System.out.println("Registered for course: " + course);
    }
    public String getInfo(){
        return "Name: " + getName() + ", ID: " + " , email: ";
    }
    public void viewTeachers() {
        System.out.println("Teachers list: ");
        for(Teacher teacher: teachers){
            System.out.println(teacher.getTeachersInfo());
        }
    }
}
