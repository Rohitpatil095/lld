package implementations.parkinglotdesign;

import implementations.parkinglotdesign.constants.VehicleType;

public class Vehicle {

    private String id;
    private String liscencePlate;
    private VehicleType vehicleType;

    // constructor, getters


    public Vehicle(String liscencePlate, VehicleType vehicleType) {
        this.liscencePlate = liscencePlate;
        this.vehicleType = vehicleType;
    }

    public String getLiscencePlate() {
        return liscencePlate;
    }

    public void setLiscencePlate(String liscencePlate) {
        this.liscencePlate = liscencePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
