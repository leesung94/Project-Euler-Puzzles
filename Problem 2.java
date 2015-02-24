
public class ProblemTwo {
	
	public static void main(String args[]) {
		int count = 2;
		int first = 1;
		int second = 2;
		while(second < 4000000) {
			int temp = first + second;
			if (temp % 2 == 0) {
				count += temp;
			}
			first = second;
			second = temp;
		}
		System.out.println(count);
	}

}
