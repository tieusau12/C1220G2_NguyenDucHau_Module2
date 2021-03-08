package _review_oop.opp_java_2;

public class KhoiC extends KhoiA {
    public KhoiC() {
    }

    public KhoiC(int idStudent, String nameStudent, String addressStudent, String prioritize, String subject1, String subject2, String subject3) {
        super(idStudent, nameStudent, addressStudent, prioritize, subject1, subject2, subject3);
    }

    @Override
    public String toString() {
        return super.toString() + " Khoi C " +
                "subject1='" + super.getSubject1() + '\'' +
                ", subject2='" + super.getSubject2() + '\'' +
                ", subject3='" + super.getSubject3() + '\'';
    }
}
