package implementations.parkinglotdesign;

import implementations.parkinglotdesign.constants.SpotType;
import implementations.parkinglotdesign.constants.VehicleType;

public abstract  class Vehicle {

    private String id;
    private String licensePlate;
    private VehicleType vehicleType;

    // constructor, getters


    public Vehicle(String liscencePlate, VehicleType vehicleType) {
        this.licensePlate = liscencePlate;
        this.vehicleType = vehicleType;
    }

    public  abstract SpotType getRequiredSpotSize();

    public String getLiscencePlate() {
        return licensePlate;
    }

    public void setLiscencePlate(String liscencePlate) {
        this.licensePlate = liscencePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
