package StudentRegistration.Assignment1;

import java.util.ArrayList;

//(Name, Age, DOB, ID, username, courses and modules registered for, etc.).

public class Student {
	private int id;
	
	private String studentName;
	private int age;
	private String username;
	
	private ArrayList<Course> courses; // make arraylist?
	private ArrayList<Module> modules;
	
	public Student(int id, String studentName, int age, String username, ArrayList<Course> courses, ArrayList<Module> modules) {
		super();
		
		this.id = id;
		this.studentName = studentName;
		this.age = age;		
		this.username = username;
		
		this.courses = courses;
		this.modules = modules;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

//	public Course[] getCourses() {
//		return courses;
//	}
//
//	public void setCourses(Course[] courses) {
//		this.courses = courses;
//	}
//
//	public Module[] getModules() {
//		return modules;
//	}
//
//	public void setModules(Module[] modules) {
//		this.modules = modules;
//	}
	
}
