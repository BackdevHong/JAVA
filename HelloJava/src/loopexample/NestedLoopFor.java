package loopexample;

public class NestedLoopFor {
	public static void main(String[] args) {
		// 구구단 구현
		int i,j;
		
		for (i=2; i<=9; i++) {
			for (j=1; j<=9; j++) {
				System.out.println( i + "X" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
