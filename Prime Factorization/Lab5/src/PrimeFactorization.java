import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> primeFactors(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j = 2; j <= i; j++){
			while(i%j == 0){
				ret.add(j);
				i = i/j;
			}
		}
		
		return ret;
	}

}
