import java.math.BigInteger;


public class ProjectThree {
	
	public static void main(String args[]) {
		BigInteger problem = new BigInteger("600851475143");
		BigInteger increment = new BigInteger("1");
		BigInteger biggest = new BigInteger("0");
		BigInteger prime = new BigInteger("2");
		//Tries all primes under 10000
		for (int i = 0; i < 10000; i++) {
			if (isPrime(prime.intValue())) {
				// Gets remainder after dividing by current prime number
				BigInteger temp[] = problem.divideAndRemainder(prime);
					if (temp[1].doubleValue() == 0) {
						// Sets new problem to be number after division
						problem = temp[0];
						if (prime.intValue() > biggest.intValue()) {
							biggest = prime;
						}
					}
				prime = prime.add(increment);
			} else {
				prime = prime.add(increment);
			}
		}
		System.out.println(biggest);
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
