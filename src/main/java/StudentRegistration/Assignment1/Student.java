package StudentRegistration.Assignment1;

import java.util.ArrayList;

public class Student {
	private int id;
	
	private String studentName;
	private int age;
	private String username;
	
	private ArrayList<Course> courses;
	private ArrayList<Module> modules;
	
	static int idCount = 0;
	
	public Student(String studentName, int age, String username) {
		super();
		
		this.id = idCount;
		idCount++;
		
		this.studentName = studentName;
		this.age = age;		
		this.username = username;
		
		this.courses = new ArrayList<Course>();
		this.modules = new ArrayList<Module>();
	}

	public void addCourse(Course c)
	{
		if (!courses.contains(c))
		{
			courses.add(c);
		}
		
		// add any modules from course that we don't already have
		for (int i=0; i < c.getModules().size(); i++)
		{
			Module m = c.getModules().get(i);
			
			if (!modules.contains(m))
			{
				modules.add(m);
			}
		}
	}
	
	// getters
	
	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getAge() {
		return age;
	}

	public String getUsername() {
		return username;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}
	
}
