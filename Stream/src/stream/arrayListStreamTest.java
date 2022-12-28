package stream;

import java.util.ArrayList;

public class arrayListStreamTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("안녕하세요!");
        arrayList.add("테스트입니다~");
        arrayList.add("함께 해볼까요??");
        arrayList.add("히히");

        arrayList.stream()
                .sorted()
                .forEach(s -> System.out.println(s)); // 글자열 정렬 출력

        System.out.println(" ");

        arrayList.stream()
                .filter(s -> s.length() > 5)
                .forEach(s -> System.out.println(s)); // 5글자 이상 출력

        System.out.println(" ");

        arrayList.stream()
                        .forEach(s -> System.out.print(s + "\t"));
        System.out.println("");
        arrayList.stream()
                .map(s -> s.length())
                .forEach(s -> System.out.print(s + "\t\t\t\s\s")); // 글자 수 출력
    }
}
