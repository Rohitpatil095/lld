package implementations.parkinglotdesign;

import implementations.parkinglotdesign.constants.SpotType;
import implementations.parkinglotdesign.constants.VehicleType;

public class Motorcycle extends Vehicle{

    public Motorcycle(String liscencePlate, VehicleType vehicleType) {
        super(liscencePlate, vehicleType);
    }

    @Override
    public SpotType getRequiredSpotSize() {
        return SpotType.SMALL;
    }
}
