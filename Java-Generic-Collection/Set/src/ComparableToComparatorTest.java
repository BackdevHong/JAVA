import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return (s1.compareTo(s2)) * -1;
    }
}

public class ComparableToComparatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new MyCompare());
        set.add(new String("aaa"));
        set.add(new String("aaa"));
        set.add(new String("ccc"));
        set.add(new String("bbb"));

        System.out.println(set);
    }
}
