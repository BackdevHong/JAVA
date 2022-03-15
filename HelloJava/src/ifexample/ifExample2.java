package ifexample;

import java.util.Scanner;

public class ifExample2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		
		int charge = 0;
		
		if(age < 8) {
			System.out.println("미취학 아동입니다. 내야할 요금은 1000원입니다.");
			charge = 1000;
		} else if ( age < 14 ) {
			System.out.println("초등생입니다. 내야할 요금은 1500원입니다.");
			charge = 1500;
		} else if ( age < 20 ) {
			System.out.println("중,고등생입니다. 내야할 요금은 2000원입니다.");
			charge = 2000;
		} else {
			System.out.println("성인입니다. 내야할 요금은 1500원입니다.");
			charge = 3000;
		}
		
		System.out.println("요금 : " + charge);
		

	}

}
