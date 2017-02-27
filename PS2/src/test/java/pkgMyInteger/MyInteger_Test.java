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

	
	MyInteger Firsttest = new MyInteger(80);

	@Test
	public void Test1() {
		

		assertTrue(Firsttest.isEven());

		assertFalse(Firsttest.isOdd());

		assertFalse(Firsttest.isPrime());
		}
	MyInteger Secondtest = new MyInteger(29);
	
	
	@Test
	public void Test2() {
		
		assertFalse(Secondtest.isEven());

		assertTrue(Secondtest.isOdd());

		assertTrue(Secondtest.isPrime());
		}
	
	@Test
	public void Test3(){
		assertTrue(MyInteger.isEven(8));
		assertTrue(MyInteger.isOdd(9));
		assertTrue(MyInteger.isPrime(5));
	}

	
	@Test
	public void Test4(){
		assertFalse(MyInteger.isEven(15));
		assertFalse(MyInteger.isOdd(2));
		assertFalse(MyInteger.isPrime(15));
	}

	@Test
	public void Test5(){
		MyInteger lasttest = new MyInteger(25);	
		assertTrue(lasttest.equals(25));
		assertTrue(lasttest.equals(25));
	}
}