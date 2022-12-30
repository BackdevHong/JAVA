package ExceptionHandlingWithResource;

public class AutoCloseableTest {
    public static void main(String[] args) {
        AutoCloseable obj = new AutoCloseable();

        try (obj){
            throw new Exception();
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("end");
    }
}
