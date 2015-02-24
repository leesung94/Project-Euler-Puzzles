
public class ProblemTen {

	public static void main(String args[] ) {
		int counter = 2000000;
		long sum = 0;
		for (int i = 2; i < counter; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
		
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
