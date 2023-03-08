package SinbleLinkedList;

public class SingleLinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<>();

        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);

        System.out.println(MyLinkedList.head.data);
        System.out.println(MyLinkedList.head.next);

        MyLinkedList.printAll();

        // 중간 값 삽입 테스트
        System.out.println();
        MyLinkedList.addNodeInside(4, 3);
        MyLinkedList.printAll();

        // 만약 중간에 값이 없다면 맨 마지막에 값을 넣게 되는것 테스트
        System.out.println();
        MyLinkedList.addNodeInside(5, 9);
        MyLinkedList.printAll();

        // 중간 값 삭제 테스트
        System.out.println();
        System.out.println(MyLinkedList.deleteNode(3));
        MyLinkedList.printAll();

        // 중간에 값이 없을때 삭제 실패 테스트
        System.out.println();
        System.out.println(MyLinkedList.deleteNode(9));
    }
}
