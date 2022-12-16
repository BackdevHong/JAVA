package ch03;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;

	public Student(int number, String name, int grade) {
		studentName = name;
		studentNumber = number;
		this.grade = grade;
	}

	public String showStudnetInfo() {
		return studentName + " 학생의 학번은 " + studentNumber + " 학번이고, 학년은 " + grade + "학년입니다.";
	}

}
