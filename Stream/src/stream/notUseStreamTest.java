package stream;

public class notUseStreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        기존 방식이라면 이렇게 썼겠지만, 아래와 같이 향상된 for문으로 사용 가능
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        for( int num : arr ) {
            System.out.println(num);
        }
    }
}
