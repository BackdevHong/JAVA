package arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // <String>을 안붙이면 권장밑줄이 뜬다,

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }

        for (String s : list){
            System.out.println(s);
        }
    }
}
