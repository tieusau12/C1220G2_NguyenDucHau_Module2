package _05_access_modifier.pratices;

public class Student {
    private int rollno;
    private String name;
    private static String college = " BBDIT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "Happy New Year!";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}



