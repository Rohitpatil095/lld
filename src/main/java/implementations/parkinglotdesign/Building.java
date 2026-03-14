package implementations.parkinglotdesign;

import java.util.List;

public class Building {
    private List<Floor> floor;
    private String id;


    public Building(List<Floor> floor) {
        this.floor = floor;
    }

    public List<Floor> getFloor() {
        return floor;
    }

    public void setFloor(List<Floor> floor) {
        this.floor = floor;
    }
}
