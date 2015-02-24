
public class ProblemSeven {
	
	public static void main(String args[]) {
		int primeCounter = 6;
		int answerPrime = 0;
		int loop = 999999999;
		for (int tryPrime = 13; tryPrime < loop; tryPrime++) {
			if (isPrime(tryPrime)) {
				primeCounter++;
				if (primeCounter == 10002) {
					answerPrime = tryPrime;
					break;
				}
			}
		}
		System.out.println(answerPrime);
	}
	
	public static boolean isPrime(int test) {
		if (test == 1)
			return false;
		else if (test < 4)
			return false;
		else if (test % 2 == 0)
			return false;
		else if (test < 9)
			return true;
		else if (test % 3 == 0)
			return false;
		else {
			double round = Math.floor(Math.sqrt(test));
			int find = 5;
			while (find < round) {
				if (test % find == 0)
					return false;
				if (test % (find+2) == 0)
					return false;
				find += 6;
			}
			return true;
		}
	}

}
