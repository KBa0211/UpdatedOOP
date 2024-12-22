package project;

import java.util.ArrayList;
import java.util.List;

public class Teacher  extends Employee {
    private List<String> courses;
    private List<Student> students;
    private String message;
    private String complaints;

    public Teacher(String name, String password) {
        super(name, password);
        this.message = message;
        this.complaints = complaints;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void viewCourses() {
        System.out.println("Viewing courses: " + courses);
    }
    public void manageCourses(String course) {
        System.out.println("Added course: " + course);
    }

    public void viewStudents() {
        System.out.println("Students list: ");
        for(Student student: students){
            System.out.println(student.getInfo());
        }
    }

    public void putMarks(Student student, String course, int marks) {
        System.out.println("Assigned marks: " + marks + " for course: " + course + " to student: " + student.getName());
    }
    /*
    @Override
    public String sendMessages() {
        return super.sendMessages() + message;
    }

    @Override
    public String sendComplaints() {
        return super.sendComplaints() + complaints;
    }
	*/
    public String getTeachersInfo(){
        return "Name: " + getName();
    }
	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}
}
