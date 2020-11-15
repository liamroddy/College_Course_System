package StudentRegistration.Assignment1;

import java.util.ArrayList;

public class Module {
	private String moduleName;
	private ArrayList<Student> studentList;
	
	private ArrayList<Course> associatedCourses;

	public Module(String moduleName) {
		super();
		this.moduleName = moduleName;
		
		studentList = new ArrayList<Student>();
		associatedCourses = new ArrayList<Course>();
	}
	
	public void AddStudent(Student s)
	{
		if (!studentList.contains(s))
		{
			studentList.add(s);
		}
	}
	
	public void AddAssociatedCourse(Course c)
	{
		if (!associatedCourses.contains(c))
		{
			associatedCourses.add(c);
		}
	}
	
	// gettera
	
	public ArrayList<Course> getAssociatedCourses() {
		return associatedCourses;
	}

	public String getModuleName() {
		return moduleName;
	}
	
	
}
