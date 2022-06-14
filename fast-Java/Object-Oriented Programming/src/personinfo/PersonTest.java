package personinfo;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 40;
        person.name = "james";
        person.isMeeried = true;
        person.numberOfChild = 3;

        System.out.println("나이: "+ person.age);
        System.out.println("이름: "+ person.name);
        System.out.println("결혼여부: "+ person.isMeeried);
        System.out.println("총 아이 수: "+ person.numberOfChild);

    }
}
