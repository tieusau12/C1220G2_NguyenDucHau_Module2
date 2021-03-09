package _review_oop.opp_java_2;

import java.util.Objects;

public class ThiSinh {
    private int idStudent;
    private String nameStudent,addressStudent,prioritize;

    public ThiSinh() {
    }

    public ThiSinh(int idStudent, String nameStudent, String addressStudent, String prioritize) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.addressStudent = addressStudent;
        this.prioritize = prioritize;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
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
        return "SBD Thí Sinh :" + idStudent +
                "\n Tên Thí Sinh :" + nameStudent +
                "\n Địa Chỉ Thí Sinh :" + addressStudent +
                "\n Độ ưu tiên :" + prioritize;
    }


}
