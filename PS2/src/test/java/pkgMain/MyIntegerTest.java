package pkgMain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest {


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
	public void testIsEven() {
		
		boolean expected = true;
		
		boolean actual = MyInteger.isEven(2);
		
		assertEquals(actual, expected); 
	}

	@Test 
	public void testIsEvenInt() {
		
		boolean expected = true;
		
		boolean actual = MyInteger.isEven(2);
		
		assertEquals(actual, expected);
	}

	@Test
	public void testIsEvenMyInteger() {
		
		MyInteger MyInt = new MyInteger(2);
		
		assertTrue(MyInteger.isEven(MyInt)); 
		
	}

	@Test
	public void testIsOdd() {
		
		boolean expected = true;
		
		boolean actual = MyInteger.isOdd(3);
		
		assertEquals(actual, expected);
	}

	@Test
	public void testIsOddInt() {
		
		boolean expected = true; 
		
		boolean actual = MyInteger.isOdd(5);
		
		assertEquals(actual, expected); 
	}
	@Test
	public void testIsOddMyInteger() {
		
		MyInteger MyInt = new MyInteger(2);
		
		assertFalse(MyInteger.isOdd(MyInt)); 
	}
	@Test
	public void testIsPrime() {
		
		boolean actual = MyInteger.isPrime(7);
		
		assertTrue(actual);
		
		boolean not = MyInteger.isPrime(4);
		
		assertFalse(not); 
	}

	@Test
	public void testIsPrimeInt() {
		
		boolean actual = MyInteger.isPrime(7);
		
		assertTrue(actual);
	}

	@Test
	public void testIsPrimeMyInteger() {
		
		MyInteger MyInt = new MyInteger(7);
		
		assertTrue(MyInteger.isPrime(MyInt));
	}
 
	@Test
	public void testIsEqualsInt() {
        
		MyInteger MyInt = new MyInteger(1);
		
		assertTrue(MyInt.isEquals(MyInt)); 
		
	} 

	@Test
	public void testIsEqualsMyInteger() {
		
		MyInteger MyInt = new MyInteger(1);
		
		assertTrue(MyInt.isEquals(MyInt)); 
		
	}
	
	@Test
	public void testIsEquals()
	{
		MyInteger myInt = new MyInteger(4);
		
		boolean b = myInt.isEquals(5);
		assertNotEquals(myInt,b);
		
	}

}









