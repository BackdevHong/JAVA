public class MyListNode {
    private String data; // 자료
    public MyListNode next; // 다음 노드를 가리키는 링크

    public MyListNode() { // 기본 생성자
        this.data = null;
        this.next = null;
    }

    public MyListNode(String data) { // 자료를 집어넣는 생성자
        this.data = data;
        this.next = null;
    }

    public MyListNode(String data, MyListNode next) { // 자료 + 다음 링크를 집어넣는 생성자
        this.next = next;
        this.data = data;
    }

    public String getData() { // 데이터 Return
        return data;
    }
}
