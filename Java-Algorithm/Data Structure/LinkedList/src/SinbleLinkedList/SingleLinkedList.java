package SinbleLinkedList;

import Node.Node;

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

    // 노드 찾는 로직
    private Node<T> search(T isData) {
        if (this.head != null) {
            Node<T> node = this.head;
            while (node.next != null) {
                if (node.data == isData) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
        return null;
    }

    // 중간에 데이터 넣는 로직
    public void addNodeInside(T data, T isData) {
        Node<T> searchNode = this.search(isData);
        if (searchNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchNode.next;
            searchNode.next = new Node<T>(data);
            searchNode.next.next = nextNode;
        }
    }

    public boolean deleteNode(T isData) {
        if (this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while (node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }
}
