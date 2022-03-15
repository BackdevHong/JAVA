package ifexample;

import java.util.Scanner;

public class SwitchCaseProblem {

	public static void main(String[] args) {
		int day = 0;
		boolean no = false;
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하시는 월을 적어주세요. : ");
		int month = scanner.nextInt();
		
		switch(month) {
			case 1: case 2: case 3: case 5: case 7: case 8: case 10: case 12: day = 31;
				break;
			case 4: case 6: case 9: case 11: day = 30;
				break;
			default : 
				no = true;
				System.err.println("해당 달은 없는 달입니다.");
				break;
		}
		if (no == false) {
			System.out.println(month + "월은 총 "+ day + "일입니다.");
		}
		
	}

}
