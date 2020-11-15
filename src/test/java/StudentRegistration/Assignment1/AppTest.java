package StudentRegistration.Assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	// make a list of modules
		Module softwareEngineering = new Module("Software Engineering III");
		Module machineLearning = new Module("Machine Learning");
		Module metricSpaces = new Module("Metric spaces");
		
		// make a list of courses
		Course computerScience = new Course("Computer Science", new DateTime(2020, 9, 1, 9, 0), new DateTime(2021, 6, 4, 17, 0)); // 1st sept 2020 @9am - 4th June 2021 @5pm
		Course maths = new Course("Maths", new DateTime(2020, 9, 1, 9, 0), new DateTime(2021, 6, 4, 17, 0));		
		
		// associate modules and courses together
		computerScience.AddModule(softwareEngineering);
		computerScience.AddModule(machineLearning);
		computerScience.AddModule(metricSpaces);
		// the two courses share one module
		maths.AddModule(machineLearning);
		maths.AddModule(metricSpaces);
		
		ArrayList<Module> moduleList = new ArrayList<Module>();
		moduleList.add(softwareEngineering);
		moduleList.add(machineLearning);
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(computerScience);		
		
		Student s1 = new Student("Bob Bobson", 25, "bobbybob69");
		s1.addCourse(computerScience);
		Student s2 = new Student("Alice Alicesmith", 19, "alllllllllice");
		s2.addCourse(maths);
		//test what happens when someone does two courses with an overlapping module
		Student s3 = new Student("Brainbox", 21, "bb99");
		s3.addCourse(maths);
		s3.addCourse(computerScience);
		
		// test student details valid
		assert(s1 != null);
		assertEquals(s1.getId(), 0);
		assertEquals(s1.getStudentName(), "Bob Bobson");
		assertEquals(s1.getAge(), 25);
		
		// is course correct
		assertEquals(s1.getCourses().size(), 1);
		assertEquals(s1.getCourses().get(0).getCourseName(), "Computer Science");
		//test modules in course, and modules in student the same
		assertEquals(s1.getCourses().get(0).getModules().size(), 3);	
		assertEquals(s1.getCourses().get(0).getModules().get(0), softwareEngineering);
		assertEquals(s1.getCourses().get(0).getModules().get(1), machineLearning);	
		assertEquals(s1.getCourses().get(0).getModules().get(2), metricSpaces);	
		assertEquals(s1.getModules().size(), 3);	
		assertEquals(s1.getModules().get(0), softwareEngineering);
		assertEquals(s1.getModules().get(1), machineLearning);
		assertEquals(s1.getModules().get(2), metricSpaces);
		
		// student 2 has one course and two modules
		assertEquals(s2.getCourses().size(), 1);
		assertEquals(s2.getModules().size(), 2);
		
		// student 3 should have two courses, but only 3 modules (no double counting modules)
		assertEquals(s3.getCourses().size(), 2);
		assertEquals(s3.getModules().size(), 3);
		assertEquals(s3.getModules().get(0), machineLearning);
		assertEquals(s3.getModules().get(1), metricSpaces);	
		assertEquals(s3.getModules().get(2), softwareEngineering);	
		
		// finally, ensure modules have correct number of associated courses (SE only for comp. sci., other two for maths as well)
		assertEquals(metricSpaces.getAssociatedCourses().size(), 2);
		assertEquals(machineLearning.getAssociatedCourses().size(), 2);
		assertEquals(softwareEngineering.getAssociatedCourses().size(), 1);
	}
}
