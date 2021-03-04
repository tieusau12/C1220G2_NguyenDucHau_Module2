package _04_review;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", salary=" + salary +
                '}';
    }
}
