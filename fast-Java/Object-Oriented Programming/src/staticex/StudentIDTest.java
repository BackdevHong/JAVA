package staticex;

public class StudentIDTest {
    public static void main(String[] args) {
        Student studentLee = new Student(123,"Lee");
        System.out.println(studentLee.getSerialNum());

        Student studentKim = new Student(124,"kim");
        System.out.println(studentKim.getSerialNum());

        System.out.println(studentLee.getStudentID());
        System.out.println(studentKim.getStudentID());
    }
}
