public class MyLinkedList {
    private MyListNode head; // 첫번째 자료
    private int count; // 노드 수

    public MyLinkedList() { // 기본 생성자
        this.head = null;
        this.count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode; // 빈 노드를 하나 만든다.
        if(head == null) { // head가 null이라면
            newNode = new MyListNode(data); // 빈 노드에 데이터를 넣어주고
            head = newNode; // head를 newNode로 바꾼다.
        }
        else { // 아니라면
            newNode = new MyListNode(data); // 마찬가지로 빈 노드에 데이터를 넣어주고
            MyListNode temp = head; // temp값을 하나 만들어서 거기에 head를 넣어준 뒤
            while (temp.next != null) { // null이 될때까지 while을 돌린다.
                temp = temp.next; // null이 아니라면 temp에 다음 노드를 temp로 바꾼다.
            }
            temp.next = newNode; // null 이라면 temp에 다음 노드에 newNode를 추가해준다.
        }
        count++; // 어찌 됐든 값이 늘어나니 count를 늘려주고

        return newNode; // newNode를 반환한다.
    }

    public MyListNode insertElement(int position, String data) {
        int i;
        MyListNode tempNode = head; // tempNode는 head를 가리키게 선언
        MyListNode preNode = null; // pre노드는 null로 선언

        MyListNode newNode = new MyListNode(data); // 새로운 노드를 생성한다.
        if(position < 0 || position > count) { // 만약 position이 이상한 값이 들어올 경우
            return null; // null을 반환한다.
        }

        if(position == 0) { // 만약 위치가 첫번째라면?
            newNode.next = head; // 새로운 노드에 링크를 head를 가르키게 바꾸고
            head = newNode; // head를 newNode로 바꾼다.
        }

        else { // 아니라면
            for (i = 0; i < position; i++) { // position 전 값이 될때까지 for문을 돌린다.
                preNode = tempNode; // preNode는 tempNode가 되고
                tempNode = tempNode.next; // tempNode를 tempNode에 링크로 바꿔준다.
            }
            newNode.next = preNode.next; // 찾았다면 newNode에 링크를 preNode에 링크로 바꿔주고
            preNode.next = newNode; // preNode에 링크를 newNode로 바꿔준다.
        }

        count++; // 어찌 됐든 값이 늘어나니 count를 늘려주고
        return newNode; // newNode를 반환한다.
    }

    public MyListNode removeElement(int position) {
        int i;
        MyListNode tempNode = head; // tempNode는 head를 가리키게 선언
        MyListNode preNode = null; // pre노드는 null로 선언

        if(position < 0 || position > count) { // 만약 position이 이상한 값이 들어올 경우
            return null; // null을 반환한다.
        }

        if(position == 0) { // 만약 위치가 첫번째라면?
            head = tempNode.next; // head를 tempNode에 링크로 바꿔준다.
        } else {
            for (i = 0; i < position; i++) { // position 전 값이 될때까지 for문을 돌린다.
                preNode = tempNode; // preNode는 tempNode가 되고
                tempNode = tempNode.next; // tempNode를 tempNode에 링크로 바꿔준다.
            }
            preNode.next = tempNode.next; // preNode에 링크를 tempNode에 링크로 바꿔준다.
        }

        count--; // 카운트를 하나 빼주고
        return tempNode; // 삭제된 노드를 리턴한다.
    }

    public String getElement(int position) {
        int i;
        MyListNode tempNode = head;

        if(position < 0 || position > count) { // 만약 position이 이상한 값이 들어올 경우
            System.out.println("포지션 오류입니다."); // 오류 메시지를 띄우고
            return null; // null을 반환한다.
        }

        if (position == 0) { // 만약 위치가 첫번째라면?
            return head.getData(); // head에 자료를 가져온다.
        }

        for(i = 0; i < position; i++) { // 위치까지 for문을 돌린다.
            tempNode = tempNode.next; // tempNode를 tempNode에 다음 링크로 바꾼다.
        }
        return tempNode.getData(); // for문을 다 돌리고 난 뒤 tempNode에 데이터를 가져온다.
    }

    public MyListNode getNode(int position) {
        int i;
        MyListNode tempNode = head;

        if(position < 0 || position > count) { // 만약 position이 이상한 값이 들어올 경우
            System.out.println("포지션 오류입니다."); // 에러 메시지를 띄우고
            return null; // null을 반환한다.
        }

        if (position == 0) { // 만약 위치가 첫번째라면?
            return head; // head에 자료를 가져온다.
        }

        for(i = 0; i < position; i++) { // 위치까지 for문을 돌린다.
            tempNode = tempNode.next; // tempNode를 tempNode에 다음 링크로 바꾼다.
        }
        return tempNode; // for문을 다 돌리고 난 뒤 tempNode에 데이터를 가져온다.
    }

    public void removeAll() {
        head = null; // head를 null로 설정하고
        count = 0; // count를 0으로 설정한다.
    }

    public int getSize() {
        return count;
    }

    public void printAll() {
        if (count == 0) { // count값이 비어 있을 때 = 아무런 내용이 없을 때
            System.out.println("출력할 내용이 없답니다."); // 에러메시지 출력
            return;
        }

        MyListNode tempNode = head; // tempNode를 생성, head로 선언한다.
        while(tempNode != null) {  // tempNode가 null이 될때까지
            System.out.print(tempNode.getData());
            tempNode = tempNode.next;
            if (tempNode != null) {
                System.out.print(" -> ");
            }
        } // 출력시킨다.
        System.out.println("");
    }

    public boolean isEmpty() {
        if (head == null) return true; // head 값이 없을때 True를 반환
        else return false; // 하나라도 있을 경우 false
    }
}
