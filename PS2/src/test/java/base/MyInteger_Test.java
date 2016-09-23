package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	static MyInteger myEven;
	static MyInteger myEven1;
	static MyInteger myOdd;
	static MyInteger myOdd1;
	static MyInteger myPrime;
	static MyInteger myPrime1;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	//Creating objects specifically for the test
	{
		myEven = new MyInteger(4);
		myEven1 = new MyInteger(4);
		myOdd = new MyInteger(5);
		myOdd1 = new MyInteger(5);
		myPrime = new MyInteger(3);
		myPrime1 = new MyInteger(3);
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

	//Tests first "Boolean isEven" 
	@Test
	public void test() {
		assertTrue(myEven.isEven());
	}
	
	//Tests first "Boolean isOdd" 
	@Test
	public void test1() {
		assertTrue(myOdd.isOdd());
	}
	
	//Tests first "Boolean isPrime" 
	@Test
	public void test2() {
		assertTrue(myPrime.isPrime());
	}
	
	//Tests first "Static Boolean isEven(int)" 
	@Test
	public void test3() {
		assertTrue(MyInteger.isEven(12));
		assertTrue(MyInteger.isEven(11));
	}
	
	//Tests first "Static Boolean isOdd(int)" 
	@Test
	public void test4() {
		assertTrue(MyInteger.isOdd(13));
		assertTrue(MyInteger.isOdd(12));
	}
	
	//Tests first "Static Boolean isPrime(int)" 
	@Test
	public void test5() {
		assertTrue(MyInteger.isPrime(17));
		assertTrue(MyInteger.isPrime(18));
	}
	
	//Tests "Static Boolean isEven(MyInteger i)"
	@Test
	public void test6() {
		assertTrue(MyInteger.isEven(myEven));
		assertTrue(MyInteger.isEven(myOdd));
	}
	
	//Tests "Static Boolean isOdd(MyInteger i)"
	@Test
	public void test7() {
		assertTrue(MyInteger.isOdd(myOdd));
		assertTrue(MyInteger.isOdd(myEven));
	}
	
	//Tests "Static Boolean isPrime(MyInteger i)"
	@Test
	public void test8() {
		assertTrue(MyInteger.isPrime(myPrime));
		assertTrue(MyInteger.isPrime(myOdd));
	}
	
	//Tests first "equals"
	@Test
	public void testEQ1() {
		assertTrue(myEven.equals(4));
		assertTrue(myEven1.equals(5));
	}
	
	//Tests second "equals"
	@Test
	public void testEQ2() {
		assertTrue(myEven.equals(myEven1));
	}
}
