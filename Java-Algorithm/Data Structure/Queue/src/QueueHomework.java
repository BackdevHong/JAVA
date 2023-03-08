import java.util.ArrayList;

class myQueue<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void enQueue(T data) {
        list.add(data);
    }

    public T deQueue() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public Boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

public class QueueHomework {
    public static void main(String[] args) {
        myQueue<Integer> mq = new myQueue<>();

        mq.enQueue(1);
        mq.enQueue(2);
        mq.enQueue(3);

        System.out.println(mq.toString());

        mq.deQueue();
        mq.deQueue();

        System.out.println(mq.toString());

        mq.deQueue();

        System.out.println(mq.isEmpty());
    }
}
