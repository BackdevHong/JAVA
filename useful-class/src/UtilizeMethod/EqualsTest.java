package UtilizeMethod;

public class EqualsTest {
    public static void main(String[] args) {
        Student std1 = new Student(1, "홍길동");
        Student std2 = new Student(1, "홍길동");

        System.out.println(std1);
        System.out.println(std2);

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
    }
}
