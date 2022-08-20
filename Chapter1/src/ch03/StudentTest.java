package ch03;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(12345, "Lee", 1);
		Student studentKim = new Student(54321, "Kim", 2);

		System.out.println(studentLee.showStudnetInfo());
		System.out.println(studentKim.showStudnetInfo());
	}
}
