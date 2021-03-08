package _review_oop.opp_java_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {

    public static void main(String[] args) {
//        List<ThiSinhManager> thiSinhList = new ArrayList<>();
        ThiSinhManager thiSinhList =new ThiSinhManager(new ArrayList<>());
        thiSinhList.addThiSinh(new ThiSinh(01, "Hau", "Đà Nẵng", "ABC"));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\t NHẬP THÔNG TIN TUYỂN SINH "
                    + "\n 1. Nhập thông tin thí sinh  \n"
                    + " 2. Hiển thị thông tin thí sinh \n"
                    + " 3. Tìm kiếm thí sinh \n"
                    + " 4. Kết thúc ");
            String choise = sc.nextLine();
            switch (choise){
                case "1":
                    System.out.println("Nhập ID thí sinh : ");
                    int idStudent = sc.nextInt();
                    System.out.println("Nhập tên thí sinh : ");
                    String nameStudent = sc.nextLine();
                    System.out.println("Nhập địa chỉ thí sinh : ");
                    String addressStudent = sc.nextLine();
                    System.out.println("Nhập diện ưu tiên của sinh viên : ");
                    String prioritizeStudent = sc.nextLine();
                    ThiSinh thiSinh= new ThiSinh(idStudent,nameStudent,addressStudent,prioritizeStudent);
                    thiSinhList.addThiSinh(thiSinh);
                    break;
                case "2":
                    thiSinhList.displayThiSinh();
                    break;

            }
        }
    }

    private static void themThiSinh(List<ThiSinh> thiSinhList, Scanner sc) {

    }
}
