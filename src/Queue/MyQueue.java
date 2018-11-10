package Queue;

public class MyQueue<E> {
    int capacity;
    Object queueArr[];
    int head = 0;
    int tail = -1;
    int currentSize = 0;
    public MyQueue (int capacity){
        this.capacity = capacity;
        queueArr = new Object[capacity];
    }
    public void enqueue (E obj){
        if (currentSize == capacity){
            System.out.println("This queue is full. Can't add any element");
        }else {
            if (tail == capacity -1){
                queueArr[tail] = obj;
                tail = -1;
            }
            tail++;
            queueArr[tail] = obj;
            currentSize++;
        }

    }

    public void dequeue (){
        if (currentSize == 0){
            System.out.println("There isn't element to remove");
        }else{
            if (head == capacity - 1){
                head = 0;
                currentSize --;
            }else{
                head++;
                currentSize--;
            }
        }
    }

    public boolean isQueueFull (){
        return currentSize == capacity;
    }

    public boolean isQueueEmpty (){
        return currentSize == 0;
    }

    public void getInfo (){
        if (head < tail){
            for (int i = head; i < tail; i++) {
                System.out.print(queueArr[i] + " ");
            }
            System.out.println();
        }else if (head == tail){
            System.out.println(queueArr[head] + " ");
        }else {
            for (int i = head; i < capacity; i++) {
                System.out.print(queueArr[i] + " ");
            }
            for (int i = 0; i < tail; i++) {
                System.out.print(queueArr[i] + " ");
            }
            System.out.println();
        }
    }
}
