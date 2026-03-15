package implementations.parkinglotdesign;

import java.util.List;

public class Floors {

    private List<ParkingSpot> spots;
    private String id;

    public Floors(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }
}

