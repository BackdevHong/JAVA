package DefaultException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DefaultExceptionTest {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    ;

    public static void main(String[] args) {
        DefaultExceptionTest test = new DefaultExceptionTest();

        try {
            test.loadClass("a.txt", "abc");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
