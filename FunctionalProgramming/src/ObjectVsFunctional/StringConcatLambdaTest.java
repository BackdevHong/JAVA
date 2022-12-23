package ObjectVsFunctional;

public class StringConcatLambdaTest {
    public static void main(String[] args) {
        StringConcat stringCC = (s1, s2) -> {
            System.out.println(s1 + " + " + s2);
        };

        stringCC.makeString("Hello", "World");
    }

}