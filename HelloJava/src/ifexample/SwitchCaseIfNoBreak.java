package ifexample;

import java.util.Scanner;

public class SwitchCaseIfNoBreak {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
				System.out.println("금메달");
			case 2: medalColor = 'S';
				System.out.println("은메달");
			case 3: medalColor = 'B';
				System.out.println("동메달");
			default: medalColor = 'A';
		}
		
		System.out.println(rank + "등은 " + medalColor + "메달 입니다.");
	}

}