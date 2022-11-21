package String;

public class TextBlockTest {
    public static void main(String[] args) {
        String test = """
                text block test
                오 이거 잘되네
                Why worked??
                idk :)
                """;
        System.out.println(test);
        System.out.println(res());
    }
    
    public static String res() {
        return """
                <h1>안녕 월드</h1>
                <p>다시 또 만나요</p>
                """;
    }
}
