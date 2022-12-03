package numbers;

import junit.framework.*;
import numbers.Numbers;

public class NumbersTest extends TestCase{
	
	Numbers numbers = new Numbers();
   
	//test add method
	public void testAdd() {
		int n = numbers.sum(2,5);
		assertEquals(n,7);
	}
	/*
	public void testSubtract() {
		fail("Not yet implemented");
	}
	
	public void testLargest() {
		fail("Not yet implemented");
	}

	public void testSmallest() {
		fail("Not yet implemented");
	}*/
}
