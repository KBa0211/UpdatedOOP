package AcademicPart;
import java.util.List;
import java.util.ArrayList;

public class Course {
	private String name;
	private List<String> teachers;
	private List<String> students; 
	private List<String> instructors; 
	private String courseType;
	//constructor
	public Course(String name, String courseType) { 
		this.name = name;
		this.courseType = courseType;
		this.students = new ArrayList<>(); 
		this.students = new ArrayList<>();
		this.instructors = new ArrayList<>();
	}
	
	//getters
	public String getName() { 
		return name;
	}
	public String getCourseType() { 
		return courseType;
	}
	public List<String> getTeachers(){ 
		return teachers;
	}
	public List<String> getStudents(){ 
		return students;
	}
	public List<String> getInstructors(){ 
		return instructors;
	}
	
	//other methods ?? 
	public void addStudent(String nameOfStudent) { 
		students.add(nameOfStudent);
	}
	public void addTeacher(String nameOfTeacher) { 
		teachers.add(nameOfTeacher);
	}
	public void setCourseTypeForStudent(String student, String newCourseType) {
        if (students.contains(student)) {
            this.courseType = newCourseType;
        }
    }
}
