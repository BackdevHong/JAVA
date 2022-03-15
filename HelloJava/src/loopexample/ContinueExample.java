package loopexample;

public class ContinueExample {
	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 100 ; i++) {
			if ((i % 3) != 0) continue;
			System.out.println(i);

		}
	}
}
