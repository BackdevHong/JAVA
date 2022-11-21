package UtilizeMethod;

public class CloneTest {
    public static void main(String[] args) {
        Student std1 = new Student(100, "Hong");
        Student stdCopy = (Student) std1.clone();

        System.out.println(std1.toString());
        System.out.println(stdCopy.toString());
    }
}
