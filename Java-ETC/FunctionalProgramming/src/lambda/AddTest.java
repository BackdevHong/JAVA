package lambda;

public class AddTest {
    public static void main(String[] args) {
        // (x, y) -> { return x, y } 람다식
        Add addElement = (x, y) -> {
            return x + y;
        }; // 자바에서의 람다식

        // 실행문이 하나일 경우에는 중괄호 빼도 무관, 하지만 return은 중괄호를 넣어줘야 함.
        // 단, 한문장이 return 그 자체를 의미할때 return을 빼줄 수 있음.
        Add addElement2 = (x, y) -> x+y;
        System.out.println(addElement.add(1, 2));
        System.out.println(addElement2.add(3, 4));
    }
}
