public class QueueTest {
    public static void main(String[] args) {
        MyLinkedQueue queue = new MyLinkedQueue();
        queue.enQueue("10");
        queue.enQueue("5");
        queue.enQueue("3");
        queue.enQueue("1");
        queue.enQueue("7");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

        queue.printQueue();
    }
}
