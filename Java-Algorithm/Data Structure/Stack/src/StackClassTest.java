import java.util.Stack;

public class StackClassTest {
    public static void main(String[] args) {
        // Stack은 LIFO 방식으로 사용함.

        Stack<Integer> myStack = new Stack<>();

        myStack.add(1);
        myStack.add(2);
        myStack.add(3); // 스택에 추가.
        myStack.push(4); // push() 메서드도 add와 동일함.

        System.out.println(myStack);

        System.out.println(myStack.pop()); // pop() 메서드는 끝에서 하나를 뺌

        System.out.println(myStack);
    }
}
