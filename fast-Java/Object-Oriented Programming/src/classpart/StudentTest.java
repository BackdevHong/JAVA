package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이순신"); // 생성자
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentkim = new Student(200, "김유신");
        studentkim.address = "경주";

        studentkim.showStudentInfo();

        /*
        System.out.println(studentkim);
        System.out.println(studentLee);
        */
    }
}
