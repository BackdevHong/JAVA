package ThrowsExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    };
    public static void main(String[] args) {
        // 위 loadClass에서 핸들링을 하는 것이 아닌 저 메소드를 쓰는 곳에서 핸들링을 한다.
        ThrowsExceptionTest test = new ThrowsExceptionTest();

        try {
            test.loadClass("a.txt", "abc");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
