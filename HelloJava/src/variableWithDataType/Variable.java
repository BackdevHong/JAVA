package variableWithDataType;

public class Variable {

	public static void main(String[] args) {
		int age; // 선언

		age = 19; // 값을 대입
		System.out.println(age); // 출력
		
		age = 10; // 또 다른 값을 대입
		System.out.println(age); // 출력
		
		int count, count2; // 동시 선언 ( 추천 드리진 않음 )		
	  //System.out.println(count); // 값이 없으면 출력되지 않음
	  //System.out.println(count2); // 값이 없으면 출력되지 않음
		count = 1; // 값 대입
		count2 = 1; // 값 대입	
		System.out.println(count); // 출력
		System.out.println(count2); // 출력
		
		int numberOfStudent = 17; // 변수는 소문자로 시작을 하여 중간중간 대문자를 써주고, 길게 써주는게 좋다.
		System.out.println(numberOfStudent); // 출력
	}
}
