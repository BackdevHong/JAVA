package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class useStreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        IntStream is = Arrays.stream(arr);
        is.forEach(n -> System.out.println(n));
        
//        is.max(); 위에서 한번 Stream을 사용한 경우 다시 Stream을 선언해줘야함. 소모되기 때문
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
