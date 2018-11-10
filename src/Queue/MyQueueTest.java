package Queue;


public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>(4);
        queue.enqueue(4);
        queue.getInfo();
        queue.dequeue();
        queue.getInfo();
        queue.enqueue(56);
        queue.getInfo();
        queue.enqueue(2);
        queue.getInfo();
        queue.enqueue(67);
        queue.getInfo();
        queue.dequeue();
        queue.getInfo();
        queue.dequeue();
        queue.getInfo();
        queue.enqueue(24);
        queue.getInfo();
        queue.dequeue();
        queue.getInfo();
        queue.enqueue(98);
        queue.getInfo();
        queue.enqueue(45);
        queue.getInfo();
        queue.enqueue(23);
        queue.getInfo();
        queue.enqueue(435);
        queue.getInfo();
    }
}
