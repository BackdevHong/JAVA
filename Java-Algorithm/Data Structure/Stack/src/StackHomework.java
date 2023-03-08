import java.util.ArrayList;

class MyStack<T> {
    private ArrayList<T> arrayList = new ArrayList<>();

    public void push(T data) {
        arrayList.add(data);
    }

    public T pop() {
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.remove(arrayList.size() - 1);
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}

public class StackHomework {
    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<>();
        ms.push(10);
        ms.push(20);
        ms.push(30);

        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());

        System.out.println(ms.isEmpty());
    }
}
