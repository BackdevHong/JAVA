import java.util.Arrays;

public class ArraysClassTest {
    public static void main(String[] args) {
        /*
          자바에서는 보다 손쉽게 배열을 다루기 위해 여러가지 클래스를 제공합니다.
          예시로 한번 Arrays 클래스를 이용하여 전체 데이터를 출력시켜 보겠습니다.
         */

        Integer[] testData = new Integer[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(testData)); // Arrays 클래스 중 ToString을 이용합니다.
    }
}
