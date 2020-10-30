package StudentRegistration.Assignment1;

import java.util.ArrayList;

import org.joda.time.DateTime;


/*
 A course programme class containing course name (CS & IT or ECE, etc.), list of
modules, list of students that are enrolled, academic start date and end date.
Start and end dates should use Joda Time classes (i.e. DateTime), which must be
added as a project dependency
 */


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
	}
	
	public void AddStudent(Student s)
	{
		enrolledStudents.add(s);
	}
	
	public void AddModule(Module m)
	{
		modules.add(m);
		m.AddAssociatedCourse(this);
	}

	
	
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

	public ArrayList<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	
}
