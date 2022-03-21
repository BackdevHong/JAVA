package array;

public class AlphaPrint {
    public static void main(String[] args) {

        char[] alphabets = new char[50000];
        char ch = '가';

        for(int i = 0; i < alphabets.length; i++){
            alphabets[i] = ch++;
        }

        for(int i = 0; i < alphabets.length; i++){
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
        }
    }
}
