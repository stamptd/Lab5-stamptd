import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> primeFactors(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		while(i%2 == 0){
			ret.add(2);
			i = i/2;
		}
		return ret;
	}

}
