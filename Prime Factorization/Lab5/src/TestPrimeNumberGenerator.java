
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
	

	private ArrayList<Integer> list(int ... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i: ints){
			ret.add(i);
		}
		return ret;
	}

}
