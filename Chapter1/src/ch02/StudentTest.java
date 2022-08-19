package ch02;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
//		클래스를 기반으로 여러개의 인스턴스가 생성될 수 있음
		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentId = 54321;
		studentKim.address = "인천 남동구";
		studentKim.studentName = "Kim";
		
		studentKim.showStudentInfo();
	}
}
