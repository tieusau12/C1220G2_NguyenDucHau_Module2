package _review_oop.opp_java_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {
    final
    public static void main(String[] args) {
        ThiSinhManager thiSinhList = new ThiSinhManager(new ArrayList<>());
        thiSinhList.addThiSinh(new ThiSinh(1, "Hau", "Đà Nẵng", "ABC"));
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\t NHẬP THÔNG TIN TUYỂN SINH "
                    + "\n 1. Nhập thông tin thí sinh  \n"
                    + " 2. Hiển thị thông tin thí sinh \n"
                    + " 3. Tìm kiếm thí sinh \n"
                    + " 4. Kết thúc ");
            System.out.println("--------------------------");
            String choise = sc.nextLine();
            switch (choise) {
                case "1":
                    addThiSinh(thiSinhList, sc);
                    break;
                case "2":
                    thiSinhList.displayThiSinh();
                    break;
                case "3":
                    System.out.println("Nhập ID thí sinh cần tìm  :");
                    int idSearch = Integer.parseInt(sc.nextLine());
                    thiSinhList.searchByList(idSearch);
                    break;
                case "4":
                    System.exit(0);
                    break;
                default: {
                    System.out.println("Vui lòng kết thúc chương trình");
                    break;
                }
            }
        } while (true);
    }

    private static void addThiSinh(ThiSinhManager thiSinhList, Scanner sc) {
        System.out.println("Nhập ID thí sinh : ");
        int idStudent = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên thí sinh : ");
        String nameStudent = sc.nextLine();
        System.out.println("Nhập địa chỉ thí sinh : ");
        String addressStudent = sc.nextLine();
        System.out.println("Nhập diện ưu tiên của sinh viên : ");
        String prioritizeStudent = sc.nextLine();
        KhoiA thiSinhKhoiA = new KhoiA(idStudent, nameStudent, addressStudent, prioritizeStudent, "Toan", "Ly", "Hoa");
        KhoiB thiSinhKhoiB = new KhoiB(idStudent, nameStudent, addressStudent, prioritizeStudent, "Toan", "Van", "Anh");
        KhoiC thiSinhKhoiC = new KhoiC(idStudent, nameStudent, addressStudent, prioritizeStudent, "Van", "Su", "Dia");
        System.out.println("Thí sinh thuốc khối nào : "
                + " 1. Khối A "
                + " 2. Khối B "
                + " 3. Khối C");
        String choise = sc.nextLine();
        switch (choise) {
            case "1":
                thiSinhList.addThiSinh(thiSinhKhoiA);
                break;
            case "2":
                thiSinhList.addThiSinh(thiSinhKhoiB);
                break;
            case "3":
                thiSinhList.addThiSinh(thiSinhKhoiC);
                break;
        }
    }
}

