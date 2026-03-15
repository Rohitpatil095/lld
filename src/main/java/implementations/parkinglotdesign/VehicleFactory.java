package implementations.parkinglotdesign;

import implementations.parkinglotdesign.constants.VehicleType;

public class VehicleFactory {
    public static Vehicle createVehicle(String liscensePlate, VehicleType vehicleType){
        switch (vehicleType){
            case MOTORCYCLE: return new Motorcycle(liscensePlate,vehicleType);
            case CAR: return new Car(liscensePlate,vehicleType);
            case BUS: return new Bus(liscensePlate,vehicleType);
            default: throw new IllegalArgumentException("Unknown vehicle type");
        }

    }

}
