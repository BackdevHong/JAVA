public class SingleLinkedList<T> {
    public Node<T> head = null;

    public void addNode(T data) {
        if (head == null) {
            this.head = new Node<>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
        }
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.print(node.data);

            while (node.next != null) {
                node = node.next;
                System.out.print(node.data);
            }
        }
    }
}
