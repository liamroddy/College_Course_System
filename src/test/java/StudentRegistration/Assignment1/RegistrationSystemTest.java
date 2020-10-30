package StudentRegistration.Assignment1;

import org.junit.Test;

import junit.framework.TestCase;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class RegistrationSystemTest extends TestCase {
	@Test
	public void test_reverse() {
		assertEquals(1, 1);
	}

	@Test
	public void testStudent()
	{
		// make a list of modules
		Module m1 = new Module("Software Engineering III");
		Module m2 = new Module("Machine Learning");
		
		// make a list of courses
		Course c1 = new Course("Computer Science", new DateTime(2020, 9, 1, 9, 0), new DateTime(2021, 6, 4, 17, 0)); // 1st sept 2020 @9am - 4th June 2021 @5pm
				
		// associate module and course together
//		m1.AddAssociatedCourse(c1);
//		m2.AddAssociatedCourse(c1);
		c1.AddModule(m1);
		c1.AddModule(m2);
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(c1);
		
		
		Student s1 = new Student(0, "Bob Bobson", 25, "bobbybob69", courseList, null);
		//(int id, String studentName, int age, String username, Course[] courses, Module[] modules)
		
		assert(s1 != null);
		assertEquals(s1.getId(), 0);
		assertEquals(s1.getStudentName(), "Bob Bobson");
	}
}
