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

    protected abstract SpotType getRequiredSpotSize();

    public String getLiscencePlate() {
        return licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
