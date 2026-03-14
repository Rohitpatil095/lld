package implementations.parkinglotdesign;

import java.util.List;

public class Floor {

    private List<ParkingSpot> spots;
    private String id;

    public Floor(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public void setSpots(List<ParkingSpot> spots) {
        this.spots = spots;
    }
}

