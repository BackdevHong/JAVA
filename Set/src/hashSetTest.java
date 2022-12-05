import java.util.HashSet;

public class hashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add(new String("안녕월드"));
        hashSet.add(new String("안녕월드"));
        hashSet.add(new String("이건 중복 테스트야"));
        hashSet.add(new String("이건 중복 테스트야"));
        hashSet.add(new String("잘가"));
        hashSet.add(new String("잘가"));

        System.out.println(hashSet);
    }
}
