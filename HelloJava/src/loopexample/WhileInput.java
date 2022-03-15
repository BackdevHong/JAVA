package loopexample;

import java.util.Scanner;

public class WhileInput {

	public static void main(String[] args) {
		int input;
		int sum = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		while (input != 0) {
			sum += input;
			input = scanner.nextInt();
		}
		System.out.println(sum);
	}

}
