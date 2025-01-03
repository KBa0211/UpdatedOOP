package controllers;

import project.UserType;
import project.Student;

import java.util.Vector;

import dll.DBContext;
import project.Manager;
import project.Teacher;
import project.User;

public class UserController {
	
	public static boolean createUser(
			String username,
			String password, 
			UserType type) {
		switch(type) {
		case TEACHER:
			Teacher newTeacher = new Teacher(username, password);
			DBContext.teacher.add(newTeacher);
			return DBContext.saveTeachers();
		case STUDENT:
			Student newStudent = new Student(username, password);
			break;
		case MANAGER:
			Manager newManager = new Manager(username, 0, password, password);
			break;
		default:
			return false;
		}
		
		return true;
	}
	
	public static Object getUsers(UserType type) {
		switch(type) {
		case TEACHER:
			return DBContext.getTeachers();
		default:
			return null;
		}
	}
	
	public static boolean authorize(String fileName, String username, String password) {
		if(fileName.equals("teacher.txt")) {
			Vector<Teacher> teachers = (Vector<Teacher>) getUsers(UserType.TEACHER);
			
			for(Teacher t: teachers) {
				if (t.getName().equals(username)
						&& t.getPassword().equals(password))
					return true;
			}
		}
		
		return false;
	}
}