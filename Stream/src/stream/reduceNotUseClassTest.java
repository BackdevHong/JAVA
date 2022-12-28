package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class reduceNotUseClassTest {
    public static void main(String[] args) {
        String[] arr = {"안녕하세요~~~", "테스트입니다", "가장 긴 문자열은 이겁니다", "히히헤헤호호"};

        String strResult = Arrays.stream(arr)
                .reduce("", (s1, s2) -> {
                    if (s1.getBytes().length >= s2.getBytes().length) {
                        return s1;
                    } else {
                        return s2;
                    }
                });

        System.out.println(strResult);
    }
}
