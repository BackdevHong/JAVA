public class ArrayTest {
    public static void main(String[] args) {
        // new 키워드를 사용하여 배열을 미리 선언합니다.
        // 데이터를 넣을 수도 있습니다.
        Integer[] data_list = new Integer[10];
        data_list[0] = 1;

        System.out.println(data_list[0]);

        /* 직접 선언할 때 데이터를 집어넣는 것도 가능합니다. */
        Integer data_list_example1[] = {1, 2, 3 ,4, 5};
        Integer[] data_list_example2 = {5, 4, 3, 2, 1};

        System.out.println(data_list_example1[1]);
        System.out.println(data_list_example2[1]);



    }
}
