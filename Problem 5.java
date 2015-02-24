
public class ProblemFive {

	public static void main(String args[]) {
		int answer = 0;
		int biggest = 1000000000;
		for (int current = 20; current < biggest; current++) {
			//Don't have to check number lower than 11 since they make up the next
			if (current % 20 == 0 && current % 19 == 0 && current % 18 == 0
					&& current % 17 == 0 && current % 16 == 0 && current % 15 == 0
					&& current % 14 == 0 && current % 13 == 0 && current % 12 == 0
					&& current % 11 == 0){
					answer = current;
					break;
			}
		}
		System.out.println(answer);
	}
	
}
