package _review_oop.opp_java_2;

public class KhoiC extends ThiSinh {
    private String subject1,subject2,subject3;

    public KhoiC() {
    }

    public KhoiC(int idStudent, String nameStudent, String addressStudent, String prioritize, String subject1, String subject2, String subject3) {
        super(idStudent, nameStudent, addressStudent, prioritize);
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject3() {
        return subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Khối C " +
                " \n Môn :" + subject1 +
                "\n Môn :" + subject2 +
                " \nMôn :" + subject3
                + "\n ----------------------";
    }
}