package DynamicClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        Constructor[] cons = c.getConstructors();
        for (Constructor co : cons) {
            System.out.println(co);
        }
        Method[] met = c.getMethods();
        for (Method m : met) {
            System.out.println(m);
        }
    }
}
