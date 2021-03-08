package _review_oop.opp_java_1;

import java.util.ArrayList;

public class Vehicle {
    private String nameCar;
    private double priceCar;
    private double taxCar;
    private double vehicleCapacity;

    public Vehicle() {
    }

    public Vehicle(String nameCar,double priceCar, double vehicleCapacity) {
        this.nameCar = nameCar;
        this.priceCar = priceCar;
        this.vehicleCapacity = vehicleCapacity;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public double getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(double priceCar) {
        this.priceCar = priceCar;
    }

    public double getTaxCar(double priceCar, double vehicleCapacity) {
        if (vehicleCapacity < 100) {
            return priceCar * 1 / 100;
        } else if (vehicleCapacity < 200) {
            return priceCar * 3 / 100;
        } else {
            return priceCar * 5 / 100;
        }
    }

    public void setTaxCar(double taxCar) {
        this.taxCar = taxCar;
    }

    public double getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "nameCar='" + nameCar + '\'' +
                ", priceCar=" + priceCar +
                ", taxCar=" + taxCar +
                ", vehicleCapacity=" + vehicleCapacity +
                '}';
    }
//     if (vehicleCapacity < 100) {
//        this.TaxCar = this.priceCar * 1 / 100;
//    } else if (vehicleCapacity >= 100 && vehicleCapacity < 200) {
//        this.TaxCar = this.priceCar * 3 / 100;
//    }else {
//        this.TaxCar = this.priceCar*5/100;
//    }
}
