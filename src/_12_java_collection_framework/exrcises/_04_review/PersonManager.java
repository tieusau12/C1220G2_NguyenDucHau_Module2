package _12_java_collection_framework.exrcises._04_review;

import java.util.List;

public class PersonManager {
    List<Person> personList;

    public PersonManager(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public void updatePerson(Person person) {
        int index = personList.indexOf(person);
        if (index == -1) {
            addPerson(person);
        } else {
            this.personList.set(index, person);
        }
    }

    public void removePerson(int index) {
        this.personList.remove(index);
    }

    public void removePerson(Person person) {
        this.personList.remove(person);
    }


}
