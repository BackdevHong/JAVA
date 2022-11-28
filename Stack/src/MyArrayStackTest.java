public class MyArrayStackTest {
    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack(10);

        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(8);
        stack.push(9);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.printAll();
    }
}
