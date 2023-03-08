import java.util.LinkedList;
import java.util.Queue;

public class QueueClassTest {
    public static void main(String[] args) {
        // 자바에서는 기본적으로 java.util 패키지에 Queue 클래스를 제공하고 있습니다.
        // Enqueue - 큐에 데이터를 집어넣습니다. add(value), offer(value) 메서드를 사용합니다.
        // Dequeue - 큐의 데이터를 뺍니다. poll(), remove() 메서드를 사용합니다.
        // Queue 클래스에 데이터 생성을 위해서는 LinkedList 클래스를 사용해야 합니다.
        // LinkedList와 관련한 부분은 나중에 포스팅하겠습니다.

        Queue<Integer> queue = new LinkedList<>(); // 큐 생성

        queue.add(10);
        queue.offer(20);
        queue.offer(30); // 큐에 새로운 데이터 입력

        System.out.println(queue); // [10, 20, 30]

        queue.poll(); // 큐의 데이터를 뽑음

        System.out.println(queue);  // [20, 30] 앞에 있는 데이터가 빠진다는 걸 볼 수 있습니다. 이 방식을 FIFO(First In First Out) 라고 합니다.

        // 물론 제네릭을 사용하여 만든 클래스이므로 여러 타입을 집어넣는 것이 가능합니다.

        Queue<String> queue2 = new LinkedList<>();

        queue2.add("안녕하세요");
        queue2.add("테스트 클래스입니다.");
        queue2.add("하하");

        System.out.println(queue2);

        queue2.poll();
        queue2.remove();

        System.out.println(queue2);
    }
}
