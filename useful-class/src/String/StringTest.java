package String;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        System.out.println(System.identityHashCode(android));
        String mix = java.concat(android);
        System.out.println(mix);
    }
}
