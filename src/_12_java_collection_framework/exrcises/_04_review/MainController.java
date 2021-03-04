package _12_java_collection_framework.exrcises._04_review;

import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager(new ArrayList<>());
        personManager.addPerson(new Student("Nguyen A", 18, 100));
        personManager.addPerson(new Student("Nguyen B", 22, 80));
        personManager.addPerson(new Teacher("Nguyen C", 60, 7000));
        personManager.addPerson(new Teacher("Nguyen D", 70, 8000));

        for (Person person : personManager.getPersonList()) {
            System.out.println(person);
        }

        Person newTeacher = new Student("Nguyen Yeu", 60, 80);
        personManager.updatePerson(newTeacher);

        System.out.println("-----------------------------");

        personManager.removePerson(new Person("Nguyen A", 10));

        for (Person person : personManager.getPersonList()) {
            System.out.println(person);
        }

    }
}
