package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(); // 생성자
        studentLee.studentName = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentkim = new Student();
        studentkim.studentName = "김유신";
        studentkim.address = "경주";

        studentkim.showStudentInfo();

        System.out.println(studentkim);
        System.out.println(studentLee);
    }
}
