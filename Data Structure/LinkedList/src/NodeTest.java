public class NodeTest {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);

        // 노드와 노드간 연결하기
        node1.next = node2;
        Node<Integer> head = node1;
    }
}
