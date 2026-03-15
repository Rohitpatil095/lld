package implementations.parkinglotdesign;

import implementations.parkinglotdesign.constants.SpotType;
import implementations.parkinglotdesign.constants.VehicleType;

public class Bus extends Vehicle{

    public Bus(String liscencePlate, VehicleType vehicleType) {
        super(liscencePlate, vehicleType);
    }

    @Override
    public SpotType getRequiredSpotSize() {
        return SpotType.LARGE;
    }
}
