package lasthomework;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setSubjectName(name);
		subject.setSubjectScore(score);
		subjectList.add(subject);
		
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject s : subjectList) {
			System.out.println("학생 " + studentName + "의 " + s.getSubjectName() + " 과목 성적은 " + s.getSubjectScore() + "점 입니다.");
			total += s.getSubjectScore();
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "점 입니다.");
	}
	
}