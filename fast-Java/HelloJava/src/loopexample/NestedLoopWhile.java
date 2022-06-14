package loopexample;

public class NestedLoopWhile {

	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		
		while ( i <= 9 ) {
			j = 1;
			while ( j <= 9 ) {
				System.out.println( i + "X" + j + "=" + i*j);
				j++;
			}
			i++;
			System.out.println();
		}

	}


}
