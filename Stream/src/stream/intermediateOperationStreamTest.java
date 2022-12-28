package stream;

import java.util.Arrays;

public class intermediateOperationStreamTest {
    public static void main(String[] args) {
        String[] strList = {"안녕하세요", "이 문자는 아마 출력될거에요", "HelloWorld", "아아"};

        Arrays.stream(strList)
                .filter(s -> s.length() > 5) // 중간 연산
                .forEach(s -> System.out.println(s)); // 최종 연산
    }

//  Stream에서의 중간 연산 종류는 map(), filter(), sorted() 등이 있음.
//  Stream에서의 최종 연산 종류는 forEach(), count(), sum() 등이 있음.
}
