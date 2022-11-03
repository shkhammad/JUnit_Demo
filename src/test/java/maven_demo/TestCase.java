package maven_demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;  


import com.hammad.BasicTest;

public class TestCase {
	
	@Test
	public void testAdd() {
		assertEquals(5, BasicTest.add(2, 3));
		assertEquals(2, BasicTest.add(2, 0));
		
		//assertEquals("Hammad","Hamma");
		
		//assertTrue("Hammad", true);
		//assertFalse("Hammad", false);
		
		
		
		//assertFalse("Hi",3>2);
		
	}
	
	@Test
	public void testSub() {
		assertEquals(5,BasicTest.sub(10, 5));
	}
	
}
