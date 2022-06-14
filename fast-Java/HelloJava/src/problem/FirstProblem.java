package problem;

import java.util.Scanner;

public class FirstProblem {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 값을 입력하시오 : ");
		int Frist_int = scanner.nextInt();
		System.out.print("두번쨰 값을 입력하시오 : ");
		int Second_int = scanner.nextInt();
		System.out.print("사칙연산에 쓰일 기호를 선택하시오. : ");
		String Operator = scanner.next();
		if (Operator.equals("+")) {
			System.out.println(Frist_int + "+" + Second_int + "=" + (Frist_int + Second_int));
		} else if (Operator.equals("-")) {
			System.out.println(Frist_int + "-" + Second_int + "=" + (Frist_int - Second_int));
		} else if (Operator.equals("*")) {
			System.out.println(Frist_int + "X" + Second_int + "=" + (Frist_int * Second_int));
		} else if (Operator.equals("/")) {
			System.out.println(Frist_int + "÷" + Second_int + "=" + (Frist_int / Second_int));
		} else if (Operator.equals("%")) {
			System.out.println(Frist_int + "%" + Second_int + "=" + (Frist_int % Second_int));
		}
		
	}
}
