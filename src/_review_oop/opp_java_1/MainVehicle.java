package _review_oop.opp_java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainVehicle {

    public static void main(String[] args) {
        List<Vehicle> vehicleManager = new ArrayList<>();
        vehicleManager.add(new Vehicle("BMW", 2000000, 200));
        vehicleManager.add(new Vehicle("Mercedes", 3000000, 300));
        vehicleManager.add(new Vehicle("Honda", 1000000, 100));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\t NHẬP THÔNG TIN XE "
                    + "\n 1. Tạo các đối tượng xe và nhập thông tin \n"
                    + " 2. Xuất bảng kê khai tiền thuế của các xe. \n"
                    + " 3. Thoát");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    add(vehicleManager, scanner);
                    break;
                case "2":
                    for (Vehicle vehicle : vehicleManager) {
                        System.out.println(vehicle.getNameCar() + " : "
                                + vehicle.getTaxCar(vehicle.getPriceCar(), vehicle.getVehicleCapacity()));
                    }
                    break;
                case "3":
                    System.exit(0);
                    break;
                default: {
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
                    break;
                }
            }
        }

    }

    private static void add(List<Vehicle> vehicleManager, Scanner scanner) {
        String nameCar;
        double priceCar;
        double vehicleCapacity;
        System.out.println("Nhap ten xe : ");
        nameCar = scanner.nextLine();
        System.out.println("Nhap gia tien cua xe : ");
        priceCar = scanner.nextDouble();
        System.out.println("Nhap dung tich xylanh xe : ");
        vehicleCapacity = scanner.nextDouble();
        Vehicle car = new Vehicle(nameCar, priceCar, vehicleCapacity);
        vehicleManager.add(car);
    }
}
