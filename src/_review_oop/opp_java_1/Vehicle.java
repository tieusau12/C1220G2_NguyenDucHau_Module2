package _review_oop.opp_java_1;

public class Vehicle {
    private String nameCar;
    private double priceCar;
    private double taxCar;
    private int vehicleCapacity;


    public Vehicle(String nameCar, double priceCar, int vehicleCapacity) {
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

    public double getTaxCar() {
        return taxCar;
    }

    public void setTaxCar(double taxCar) {
        this.taxCar = taxCar;
    }

    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

//    @Override
//    public String toString() {
//        return "Vehicle{" +
//                "nameCar='" + nameCar + '\'' +
//                ", priceCar=" + priceCar +
//                ", taxCar=" + taxCar +
//                ", vehicleCapacity=" + vehicleCapacity +
//                '}';
//    }
}
