import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(7);
        linkedList.forEach(integer -> System.out.println(integer));
    }
}
