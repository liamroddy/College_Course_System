package StudentRegistration.Assignment1;

import java.util.ArrayList;

/*A module class, which should contain information such as module name, id (e.g. CT417), list of students, courses it is associated with)

*/
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
		studentList.add(s);
	}
	
	public void AddAssociatedCourse(Course c)
	{
		associatedCourses.add(c);
	}
}
