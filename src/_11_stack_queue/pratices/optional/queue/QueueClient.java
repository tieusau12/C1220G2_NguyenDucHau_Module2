package _11_stack_queue.pratices.optional.queue;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(90);
        queue.enqueue(200);
        queue.enqueue(110);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(89);
        queue.enqueue(19);
        queue.enqueue(9);
        queue.enqueue(8);
    }
}
