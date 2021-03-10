package _17_banary_stream.exrcises;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProduct {
    static ProductManager proManager = new ProductManager(new ArrayList<>());

    public static void main(String[] args) {
        proManager.addProduct(new Product(1, "Iphone 5", "Apple", 785485.0, "Color Gold"));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\t THÔNG TIN SẢN PHẨM \n"
                    + "1 . Nhập thông tin sản phẩm \n"
                    + "2. Hiển thị sản phẩm \n "
                    + "3. Tìm kiếm sản phẩm theo ID  \n"
                    + "4. Exit ");
            System.out.println("---------------------");
            String choise = sc.nextLine();
            switch (choise) {
                case "1":
                    addProducts(sc);
                    break;
                case "2":
                    proManager.displayProduct();
                    break;
                case "3":
                    System.out.println("Nhap ID can tim : ");
                    int idSearch = Integer.parseInt(sc.nextLine());
                    proManager.searchProduct(idSearch);
                    break;
                case "4":
                    System.exit(0);
                    break;

            }
        }
    }

    private static void addProducts(Scanner sc) {
        System.out.println("Nhập số lượng sản phẩm cần thêm ");
        int amount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < amount; i++) {
            System.out.println(" Nhập ID :");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap ten san pham : ");
            String name = sc.nextLine();
            System.out.println("Nhap ten hang :");
            String manuFacturer = sc.nextLine();
            System.out.println("Nhap gia san pham :");
            double cost = Double.parseDouble(sc.nextLine());
            System.out.println("Cac mo ta khac cua san pham :");
            String other = sc.nextLine();
            Product product = new Product(id, name, manuFacturer, cost, other);
            proManager.addProduct(product);
        }
        proManager.writeProduct(proManager.productList);
    }
}
