import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class TestPrimeFactorization {
	@Test
	public void testJUnit(){
		assertTrue("The compiler is happy today", true);
	}
	@Test
	public void testOne(){
		assertEquals(list(),PrimeFactorization.primeFactors(1));
	}
	@Test
	public void testTwo(){
		assertEquals(list(2),PrimeFactorization.primeFactors(2));
	}
	@Test
	public void TestThree(){
		assertEquals(list(3),PrimeFactorization.primeFactors(3));
	}
	@Test
	public void TestFour(){
		assertEquals(list(2,2),PrimeFactorization.primeFactors(4));
	}
	@Test
	public void TestSix(){
		assertEquals(list(2,3),PrimeFactorization.primeFactors(6));
	}
	@Test
	public void TestEight(){
		assertEquals(list(2,2,2),PrimeFactorization.primeFactors(8));
	}
	private ArrayList<Integer> list(int ... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i: ints){
			ret.add(i);
		}
		return ret;
	}
	
}
