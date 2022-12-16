import java.util.TreeSet;

public class TreeSetTest {

    public static void exportStr(TreeSet<String> T) {
        for(String str : T) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add(new String("홍길동"));
        treeSet.add(new String("간감상"));
        treeSet.add(new String("다부진"));
        treeSet.add(new String("키리토"));
        treeSet.add(new String("미도리야"));
        treeSet.add(new String("토리코"));

        exportStr(treeSet);
    }
}
