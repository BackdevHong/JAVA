public class MyLinkedQueue extends MyLinkedList implements IQueue{

    MyListNode front; // 맨 앞부분인 front
    MyListNode rear; // 맨 뒷부분인 rear

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if(isEmpty()) { // 만약 비었으면
            newNode = addElement(data); // newNode를 만들어서 할당하고
            front = newNode;
            rear = newNode; // front와 rear 둘다 newNode로 바꿉니다.
        } else { // 하나라도 있으면
            newNode = addElement(data); // 똑같이 newNode를 만들어서 할당하고
            rear = newNode; // rear만 newNode로 바꿔줍니다.
        }
    }

    @Override
    public String deQueue() {
        if (isEmpty()) { // 만약 비었다면?
            return null; // 아무것도 없으므로 null을 return합니다.
        }

        String data = front.getData(); // front 자료 값을 불러옵니다.
        front = front.next; // front를 front에 링크로 바꿉니다.

        if(front == null) { // front가 null이라면?
            rear = null; // 마지막인 rear도 null로 바꿔줍니다.
        }

        return data; // data를 return 합니다.
    }

    @Override
    public void printQueue() {
        printAll(); // 전에 만들었던 MyLinkedList에서 불러옵니다.
    }
}
