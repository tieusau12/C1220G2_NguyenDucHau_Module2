package _12_java_collection_framework.pratices.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Hậu", 30, "Quảng Nam");
        Student student1 = new Student("Sang", 22, "Đà Nẵng");
        Student student2 = new Student("Kiên", 21, "Hồ Chí Minh");
        Student student3 = new Student("Đông", 29, "Hà Nội");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println(" So sanh theo tuoi : ");
        for (Student st: lists) {
            System.out.println(st.toString());
        }

    }
}
