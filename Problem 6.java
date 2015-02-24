
public class ProblemSix {
	
	public static void main(String args[]) {
		int sqSum = 0;
		int ttlSum = 0;
		int answer = 0;
		for (int i = 1; i < 101; i++) {
			ttlSum += i;
			sqSum += i * i;
		}
		ttlSum = ttlSum * ttlSum;
		answer = ttlSum - sqSum;
		System.out.println(answer);
	}

}
