import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListClassTest {
    public static void main(String[] args) {
        /*
        ArrayList 클래스는 가변 길이 즉, 크기가 정해져 있지 않은 배열 자료구조를 다룰 수 있는 기능을 제공하는 클래스입니다.
         */

        List<Integer> test_list = new ArrayList<>();
        ArrayList<Integer> test_Data = new ArrayList<>();

        /*
        List와 ArrayList에 다른점은 List는 인터페이스, ArrayList는 자체적인 클래스라는 것입니다.
        List로 선언된 변수는 다음과 같이 필요에 따라 다른 리스트 클래스를 쓸 수 있는 구현상의 유연함을 제공합니다.
         */

        test_list = new LinkedList<>(); // 뭐 굳이 동일 변수에 다양한 리스트 클래스를 쓸 필요는 없습니다 XD

        /*
        ArrayList에 선언 방식은 두가지가 있습니다.
         */

        ArrayList<Integer> first = new ArrayList<Integer>(); // JDK 1.7 이전
        ArrayList<Integer> second = new ArrayList<>(); // JDL 1.7 이후
        // JDK 1.7 이상부터는 인스턴스 생성 시 타입을 추적할 수 있는 경우 new 키워드를 사용할 때 타입을 생략할 수 있는 구문을 사용할 수 있습니다.

        /**
         * 한번 ArrayList를 사용해보도록 합시다.
         */

        ArrayList<Integer> test = new ArrayList<>(); // 선언

        test.add(1);
        test.add(2);
        test.add(3); // 데이터 추가

        test.set(0, 2); // Set - 특정 인덱스 값을 다른 값으로 변경할때 사용하는 메서드입니다. 해당 코드는 0번째 인덱스 값을 2로 바꾼다는 뜻이죠.
        System.out.println(test.get(0)); // Get - 특정 인덱스 값을 불러오는 것입니다. 해당 코드는 0번째 인덱스를 가져옵니다.

        test.remove(0); // Remove - 특정 인덱스 값을 삭제합니다. 삭제할 시 값은 한 칸 앞으로 오게 됩니다.
        System.out.println(test.toString());
    }
}
