
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPrimeNumberGenerator {
	@Test
	public void testOne(){
		assertEquals(list(),TestPrimeNumberGenerator.generatePrimes(1));
	}
	
	private static Object generatePrimes(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<Integer> list(int ... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i: ints){
			ret.add(i);
		}
		return ret;
	}

}
