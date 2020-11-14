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
		Module m1 = new Module("Software Engineering III");
		Module m2 = new Module("Machine Learning");
		
		// make a list of courses
		Course c1 = new Course("Computer Science", new DateTime(2020, 9, 1, 9, 0), new DateTime(2021, 6, 4, 17, 0)); // 1st sept 2020 @9am - 4th June 2021 @5pm
				
		// associate module and course together
		c1.AddModule(m1);
		c1.AddModule(m2);
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(c1);		
		
		Student s1 = new Student(0, "Bob Bobson", 25, "bobbybob69", courseList, null);
		
		assert(s1 != null);
		assertEquals(s1.getId(), 0);
		assertEquals(s1.getStudentName(), "Bob Bobson");
	}
}
