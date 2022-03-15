package variableWithDataType;

public class IntegerTest {
	public static void main(String[] args) {
		byte bs = 127; // -128에서 128까지에 음,정수만 표현 가능
		System.out.println(bs);
			
		// int ival = 12345678900; // 너무 큰 수라서 선언이 안됨
		// long lval = 12345678900; // 4바이트 안으로 안들어가서 선언이 안됨
		long lval = 12345678900L; // 그래서 뒤에 L을 붙여 Long라고 인식하게 만듬
		// 그래서 Long타입을 사용할때에는 뒤에 L을 붙여 Long라고 인식하게 하는것이 중요!
		System.out.println(lval);
			
	}

}

