package reduce;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class stringLengthCheck implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }
}
public class reduceUseClassTest {
    public static void main(String[] args) {
        String[] arr = {"안녕하세요~~~", "테스트입니다", "가장 긴 문자열은 이겁니다", "히히헤헤호호"};

        String strResult = Arrays.stream(arr)
                .reduce(new stringLengthCheck())
                .get();

        System.out.println(strResult);
    }
}
