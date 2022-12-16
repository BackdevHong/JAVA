package ch04;

public class SubjectTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		
		studentLee.setKoreaSubject("국어", 50);
		studentLee.setMathSubject("수락", 100);

		Student studentKim = new Student(200, "Kim");
		
		studentKim.setKoreaSubject("국어", 10);
		studentKim.setMathSubject("수락", 20);

		studentLee.showscore();
		studentKim.showscore();
	}
}
