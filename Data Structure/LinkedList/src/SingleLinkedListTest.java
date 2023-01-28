public class SingleLinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<>();

        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);

        System.out.println(MyLinkedList.head.data);
        System.out.println(MyLinkedList.head.next);

        MyLinkedList.printAll();
    }
}
