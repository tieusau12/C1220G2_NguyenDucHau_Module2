package _05_access_modifier.pratices;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Hau");
        Student s2 = new Student(222, "Hoang");
        Student s3 = new Student(333, "Hien");
        s1.display();
        s2.display();
        s3.display();
    }
}
