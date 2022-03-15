package problem;

import java.util.Scanner;

public class FirstProblemWithSwitch {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 값을 입력하시오 : ");
		int Frist_int = scanner.nextInt();
		System.out.print("두번쨰 값을 입력하시오 : ");
		int Second_int = scanner.nextInt();
		System.out.print("사칙연산에 쓰일 기호를 선택하시오. : ");
		String Operator = scanner.next();
		switch(Operator) {
			case "+":
				System.out.println(Frist_int + "+" + Second_int + "=" + (Frist_int + Second_int));
				break;
			case "-":
				System.out.println(Frist_int + "-" + Second_int + "=" + (Frist_int - Second_int));
				break;
			case "*":
				System.out.println(Frist_int + "X" + Second_int + "=" + (Frist_int * Second_int));
				break;
			case "/":
				switch(Second_int) {
				case 0: System.out.println("빡통갈아.. 0으로 나눌수는 없단다..");
					break;
				default:
					System.out.println(Frist_int + "÷" + Second_int + "=" + (Frist_int / Second_int));
					break;
				}
				System.out.println(Frist_int + "÷" + Second_int + "=" + (Frist_int / Second_int));
			case "%":
				switch(Second_int) {
					case 0: System.out.println("빡통갈아.. 0으로 나눌수는 없단다..");
						break;
					default:
						System.out.println(Frist_int + "%" + Second_int + "=" + (Frist_int % Second_int));
						break;
						
				}
		}
	}

}
