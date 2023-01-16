import java.util.Arrays;

public class MultidimensionalArrayTest {
    public static void main(String[] args) {
        // 자바에서는 기본 문법으로 다차원 배열 선언이 가능합니다.
        Integer[][] TwoDimension = {
                {1, 2, 3},
                {1, 2, 3}
        }; // 2차원 배열 선언

        System.out.print(TwoDimension[0][0]);
        System.out.print(TwoDimension[0][1]);
        System.out.println(TwoDimension[0][2]);
        System.out.print(TwoDimension[1][0]);
        System.out.print(TwoDimension[1][1]);
        System.out.println(TwoDimension[1][2]); // 전부 출력

        /** 과제 한번 해봅시다.
         * 다음과 같은 3차원 배열이 주어진다고 가정했을 떄, 이 중 8, 10, 2를 순서대로 각각의 라인에 출력해봅시다.
         */

        Integer[][][] ThreeDimension = {
                {
                        {1, 2, 3}, {4, 5, 6}
                },
                {
                        {7, 8, 9}, {10, 11, 12}
                }
        };

        /*
        정답 코드
         */

        System.out.println(ThreeDimension[1][0][1]);
        System.out.println(ThreeDimension[1][1][0]);
        System.out.println(ThreeDimension[0][0][1]);

    }
}
