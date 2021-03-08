package _review_oop.opp_java_2;

public class ThiSinh {
    private int listStudent;
    private String nameStudent;
    private String addressStudent;
    private String prioritize;

    public ThiSinh(int listStudent, String nameStudent, String addressStudent, String prioritize) {
        this.listStudent = listStudent;
        this.nameStudent = nameStudent;
        this.addressStudent = addressStudent;
        this.prioritize = prioritize;
    }

    public int getListStudent() {
        return listStudent;
    }

    public void setListStudent(int listStudent) {
        this.listStudent = listStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    public String getPrioritize() {
        return prioritize;
    }

    public void setPrioritize(String prioritize) {
        this.prioritize = prioritize;
    }

    @Override
    public String toString() {
        return "Student{" +
                "listStudent=" + listStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", addressStudent='" + addressStudent + '\'' +
                ", prioritize='" + prioritize + '\'' +
                '}';
    }
}
