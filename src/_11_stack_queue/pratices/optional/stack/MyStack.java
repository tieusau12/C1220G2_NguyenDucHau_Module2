package _11_stack_queue.pratices.optional.stack;

public class MyStack {
    private int size;
    private int arrayStack[];
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arrayStack = new int[size];
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is Full");
        }
        arrayStack[index] = element;
        index++;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }


    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arrayStack[--index];
    }

    public int size() {
        return index;
    }
}
