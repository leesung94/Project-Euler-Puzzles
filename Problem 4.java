
public class ProblemFour {

	public static void main(String args[]) {
		int biggest = 0;
		for (int first = 100; first < 1000; first++) {
			for (int second = 100; second < 1000; second++) {
				int resultNumber = 0;
				int prod = first * second;
				//Reverse number by dividing i by finding remainder then dividing by 10 for 
				//Next number, add mod remainder to result after multiplying current results
				//By ten
			    for(int i = prod; i !=0; i /= 10) {
			        resultNumber = resultNumber * 10 + i % 10;
			        if (resultNumber == prod && biggest < prod) {
			        	biggest = prod;
			        }
			    }
			}
		}
		System.out.println(biggest);
	}
	
}
