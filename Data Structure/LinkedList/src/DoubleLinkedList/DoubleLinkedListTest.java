package DoubleLinkedList;

public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();

        doubleLinkedList.addNode(1);
        doubleLinkedList.addNode(2);
        doubleLinkedList.addNode(3);
        doubleLinkedList.addNode(4);

        doubleLinkedList.printAll();

        System.out.println();
        System.out.println(doubleLinkedList.headSearch(2));
        System.out.println(doubleLinkedList.tailSearch(3));
        System.out.println(doubleLinkedList.tailSearch(5));
    }
}
