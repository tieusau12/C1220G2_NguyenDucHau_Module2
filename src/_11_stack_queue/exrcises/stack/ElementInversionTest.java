package _11_stack_queue.exrcises.stack;

public class ElementInversionTest {
    private static void stackOfString() {
        ElementInversion elementInversion = new ElementInversion(7);
        elementInversion.push(10);
        elementInversion.push(2);
        elementInversion.push(299);
        elementInversion.push(100);
        elementInversion.push(5);
        System.out.println(" Size of stack : " + elementInversion.size());
    }

    public static void main(String[] args) {
        stackOfString();
    }
}
