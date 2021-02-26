package _10_dsa_list.exrcises.arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Double>  listDouble = new MyList<>();
        listDouble.add(8.9);
        listDouble.add(10.2);
        listDouble.add(0.2);
        System.out.println("Element 2 : " + listDouble.get(2));
        System.out.println("Element 1 : " + listDouble.get(1));
        System.out.println("Element 3 : " + listDouble.get(3));
    }
}
