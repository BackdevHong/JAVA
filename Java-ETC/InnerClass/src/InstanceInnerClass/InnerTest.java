package InstanceInnerClass;

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();

        outClass.usingClass();

        // 만약 InClass가 private가 아닐 경우엔 이렇게 생성할 수도 있다.

        OutClass.InClass inner = outClass.new InClass();
        inner.inTest();
    }
}
