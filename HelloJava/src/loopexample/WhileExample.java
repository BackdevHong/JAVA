package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while ( i <= 10 ) {
			sum += i;
			i++;	
		}
		System.out.println(sum);
		System.out.println(i);
	}

}
