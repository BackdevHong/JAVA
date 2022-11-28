public class MyArrayStack {
    MyArray arrayStack; // 저번에 만든 MyArray를 가져와 선언함
    int top; // top은 Count와 같은 역할임

    public MyArrayStack() {  // 기본 생성자
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) { // 사이즈를 받을때는
        top = 0; // Top는 그대로 있어야함!
        arrayStack = new MyArray(size); // MyArray에 사이즈를 전달.
    }

    public void push(int data) {
        if (isFull()) { // 만약 다 찼다면?
            System.out.println("꽉차서 자료를 추가할 수 없습니다."); // 에러 메시지 출력
            return;
        }
        arrayStack.addElement(data); // 자료 추가
        top++; // top 증가
    }

    public int pop() {
        if(isEmpty()) { // 만약 비었다면?
            System.out.println("배열이 비어있습니다."); // 에러 메시지 출력
            return MyArray.ERROR_NUM; // 에러 넘버 반환
        }
        return arrayStack.deleteElement(--top); // 아니라면 요소를 삭제함과 동시에 삭제한 요소를 반환
    }

    public int peek() {
        if(isEmpty()) { // 만약 비었다면?
            System.out.println("배열이 비어있습니다."); // 에러 메시지 출력
            return MyArray.ERROR_NUM; // 에러 넘버 반환
        }
        return arrayStack.getElement(--top);
    }

    public boolean isFull() {
        if (top == arrayStack.ARRAY_SIZE) { // top과 배열 크기가 같으면
            return true; // 꽉찬거라고 전해줌
        }
        return false; // 아님 안찼다고 전해줌
    }

    public boolean isEmpty() {
        if (top == 0) { // top이 0이라면?
            return true; // 비었다고 전해줌
        }
        return false; // 아님 하나 이상 들어와있다고 전해줌
    }

    public void printAll() {
        arrayStack.checkMyArr();
    }
}
