
public class ProblemNine {

	public static void main(String args[]) {
		int ans = 0;
		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				for (int c = 1; c < 1000; c++) {
					int tempa = a * a;
					int tempb = b * b;
					int tempc = c * c;
					int tempAdd = c + b + a;
					if ((tempc == tempa + tempb) && (tempAdd == 1000)) {
						ans = a * b * c;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
	
}
