package array;

public class ArrayTest {
    public static void main(String[] args) {
        //int[] arr2;
        //arr2 = {1,2,3} 이러면 초기화가 진행되지 않음.
        int [] arr = new int[10];
        int total = 0;
        //int[] arr = new int[] {1,2,3}; // 선언과 동시에 초기화.

        for(int i=0,num=1; i < arr.length; i++, num++){
            arr[i] = num;
        }

        for(int i=0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println(total);


        double[] dArr = new double[5];
        int count = 0;
        dArr[0] = 1.1; count++;
        dArr[1] = 2.2; count++;
        dArr[2] = 4.2; count++;

        int mtotal = 1;
        for(int i=0; i < count; i++){
            mtotal *= dArr[i];
        }
        System.out.println (mtotal);
        // 유효한 값에 범위를 잘 생각하고 코딩을 하자.
    }
}
