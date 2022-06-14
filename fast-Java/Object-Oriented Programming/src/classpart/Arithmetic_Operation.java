package classpart;

import java.util.Scanner;

public class Arithmetic_Operation {
    public static void AO(int First_Num, int Second_Num){
        System.out.println(First_Num + Second_Num);
        System.out.println(First_Num - Second_Num);
        System.out.println(First_Num * Second_Num);
        System.out.println(First_Num / Second_Num);
        System.out.println(First_Num % Second_Num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 수를 입력하십쇼 : ");
        int First_Num = scanner.nextInt();
        System.out.print("두번째 수를 입력하십쇼 : ");
        int Second_Num = scanner.nextInt();
        AO(First_Num, Second_Num);
    }
}
