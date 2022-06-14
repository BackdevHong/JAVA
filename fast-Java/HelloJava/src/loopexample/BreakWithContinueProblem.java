package loopexample;

public class BreakWithContinueProblem {
	public static void main(String[] args) {
		int i;
		int j;
		for (i = 2; i <= 9; i++) {
			if ((i % 2) != 0) {
				continue;
			} else {
				for (j = 1; j <= 9; j++) {
					if (i < j) {
						break;
					} else {
						System.out.println(i+"X"+j+"="+(i*j));
					}
				}
				System.out.println("");
			}
		}
	}
}
