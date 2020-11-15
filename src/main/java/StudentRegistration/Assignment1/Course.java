package StudentRegistration.Assignment1;

import java.util.ArrayList;

import org.joda.time.DateTime;



public class Course {
	private String courseName;	
	private DateTime startDate; // = new DateTime();
	private DateTime endDate;
	
	private ArrayList<Student> enrolledStudents;
	private ArrayList<Module> modules;

	public Course(String courseName, DateTime startDate, DateTime endDate) {
		super();
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
		
		enrolledStudents = new ArrayList<Student>();
		modules = new ArrayList<Module>();
	}
	
	public void AddStudent(Student s)
	{
		if (!enrolledStudents.contains(s))
		{
			enrolledStudents.add(s);
		}
	}
	
	public void AddModule(Module m)
	{
		if (!modules.contains(m))
		{
			modules.add(m);
			m.AddAssociatedCourse(this);
		}
	
	// getters
	}
	
	public String getCourseName() {
		return courseName;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public ArrayList<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public ArrayList<Module> getModules()
	{
		return modules;
	}
}
