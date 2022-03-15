package variableWithDataType;

public class StringTest {

	public static void main(java.lang.String[] args) {
		char ch = 'A'; // char 선언
		System.out.println(ch); // 출력
		System.out.println((int)ch); // int값으로 출력
		
		int iCh = 66;
		System.out.println(iCh);
		System.out.println((char)iCh);
		
	  //char ch2 = -66; // 음수는 선언이 안됨
		
		char hangle = '\uAC00';
		System.out.println(hangle);
		
		char hangle2 = '가';
		System.out.println(hangle2);
	}
	
}
