import java.util.ArrayList;


public class PrimeNumberGenerator {

	
	static ArrayList<Integer> generatePrimes(int input) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		//arrays in java are initialized to 0
		int basket[] = new int[input];
		for(int i = 2; i<input; i++){
			if(basket[i] == 0){
				ret.add(i);
				for(int j = i*i ; j < input; j+=i){
					basket[j] = 1;
				}
			}
		}
			
		return ret;
		
	}

}
