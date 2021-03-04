package _12_java_collection_framework.pratices.hashmap_hashset;

import _12_java_collection_framework.pratices.hashmap_hashset.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student("Nam" , 20, "HN");
        Student studentTwo = new Student("Hau" , 29, "DaNang");
        Student studentThree = new Student("Hien" , 19, "HCM");

        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,studentOne);
        studentMap.put(2,studentTwo);
        studentMap.put(3,studentThree);
        studentMap.put(4,studentOne);
        for (Map.Entry<Integer , Student> studentEntry: studentMap.entrySet()) {
            System.out.println(studentEntry.toString());
        }
        System.out.println("............. Set ");
        Set<Student> students = new HashSet<Student>();
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentOne);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
