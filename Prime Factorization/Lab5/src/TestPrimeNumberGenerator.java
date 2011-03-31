
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPrimeNumberGenerator {
	@Test
	public void testOne(){
		assertEquals(list(),PrimeNumberGenerator.generatePrimes(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(),PrimeNumberGenerator.generatePrimes(2));
		
	}
	@Test public void testThree(){
		assertEquals(list(2),PrimeNumberGenerator.generatePrimes(3));
	}
	@Test public void testFour(){
		assertEquals(list(2,3),PrimeNumberGenerator.generatePrimes(4));
	}
	@Test public void TestFive(){
		assertEquals(list(2,3),PrimeNumberGenerator.generatePrimes(5));
	}
	@Test public void TestSeventyTwo(){
		assertEquals(list(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71),PrimeNumberGenerator.generatePrimes(72));
	}
	@Test public void TestOneSeventyFour(){
		assertEquals(list(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173),PrimeNumberGenerator.generatePrimes(174));
	}
	

	private ArrayList<Integer> list(int ... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i: ints){
			ret.add(i);
		}
		return ret;
	}

}
