package _04_review;

public class Student extends Person {
    private int point;

    public Student(String name, int age, int point) {
        super(name, age);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", point=" + point +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Student)){
            return false;
        }

        Student otherStudent = (Student) obj;
        if(this.point == otherStudent.point){
            return true;
        }
        return false;
    }
}
