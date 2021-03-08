package _review_oop.opp_java_1;

import java.util.List;

public class VehicleManager {
    List<Vehicle> vehicleList;

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public VehicleManager(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
    public void addVehicle(Vehicle vehicle){
        this.vehicleList.add(vehicle);
    }
    public void displayVehicle(){
        for (Vehicle vehicle: vehicleList) {
            System.out.println(vehicle);
        }
    }
}
