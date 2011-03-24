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
	private ArrayList<Integer> list(int ... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i: ints){
			ret.add(i);
		}
		return ret;
	}
	
}
