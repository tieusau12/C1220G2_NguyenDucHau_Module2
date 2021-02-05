package _05_access_modifier.pratices;


class A {
    //    private int data = 40;
//
//    private void msg() {
//        System.out.println("Hello java");
//    }
    public int data = 40;
    public void msg() {
        System.out.println("Hello java");
    }
}

public class PraAccessModifier {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data);
        obj.msg();
    }
}

