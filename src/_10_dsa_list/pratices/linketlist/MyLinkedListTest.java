package _10_dsa_list.pratices.linketlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING  /=/=/=/=");
        MyLinkedList linklist = new MyLinkedList(10);
        linklist.addFirst(11);
        linklist.addFirst(13);
        linklist.addFirst(12);

        linklist.add(4,9);
        linklist.add(4,8);
        linklist.add(2,2);
        linklist.add(1,1);
        linklist.printList();
    }
}
