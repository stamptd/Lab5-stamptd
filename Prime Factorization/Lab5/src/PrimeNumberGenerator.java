import java.util.ArrayList;


public class PrimeNumberGenerator {

	
	static ArrayList<Integer> generatePrimes(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j = 2; j < i; j++){
			ret.add(j);
		}
		return ret;
		
	}

}
