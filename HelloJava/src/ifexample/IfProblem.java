package ifexample;

import java.util.Scanner;

public class IfProblem {
	
	public static void Score( String i ) {
		System.out.println("해당 학생에 학점은 " + i + "!");
	}

	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("점수 판정 시스템에 어서오세요! made by 홍인성");
			System.out.print("점수를 입력해주세요! : ");
			int ScoreOfStudent = scanner.nextInt();
			
			if (ScoreOfStudent > 100) {
				System.err.println("100점을 넘길 수 없습니다!");
			} else if (ScoreOfStudent >= 90) {
				Score("A");
			} else if (ScoreOfStudent >= 80) {
				Score("B");
			} else if (ScoreOfStudent >= 70) {
				Score("C");
			} else if (ScoreOfStudent >= 60) {
				Score("D");
			} else {
				Score("F");
			}
		
	}
}