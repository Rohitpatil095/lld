package implementations.parkinglotdesign;

import implementations.parkinglotdesign.constants.SpotType;
import implementations.parkinglotdesign.constants.VehicleType;

public class Car extends  Vehicle{

    public Car(String liscencePlate, VehicleType vehicleType) {
        super(liscencePlate, vehicleType);
    }

    @Override
    public SpotType getRequiredSpotSize() {
        return SpotType.MEDIUM;
    }
}
