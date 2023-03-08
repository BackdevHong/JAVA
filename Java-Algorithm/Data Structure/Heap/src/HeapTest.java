public class HeapTest {
    public static void main(String[] args) {
        Heap heap = new Heap(15);

        System.out.println(heap.heapArray);

        heap.insert(10);
        heap.insert(8);
        heap.insert(5);
        heap.insert(4);

        System.out.println(heap.heapArray);

        heap.insert(20);

        System.out.println(heap.heapArray);

        heap.pop();
        System.out.println(heap.heapArray);
    }
}
