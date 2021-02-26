package _11_stack_queue.exrcises.stack;

public class ElementInversion {
    private int arrayStack[];
    private int size;
    private int index = 0;

    public ElementInversion(int size) {
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

    public int size() {
        return index;
    }
}
