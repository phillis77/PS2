package pkgMyInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testEven() {
		MyInteger myInt = new MyInteger(2);
		assertTrue(myInt.isEven());
	}

	public void testOdd() {
		MyInteger myInt = new MyInteger(3);
		assertTrue(myInt.isEven());
	}

	public void testPrime() {
		MyInteger myInt = new MyInteger(23);
		assertTrue(myInt.isPrime());
	}

	public void testEqual() {
		MyInteger myInt = new MyInteger(13);
		assertTrue(myInt.isEquals(myInt));
	}

}