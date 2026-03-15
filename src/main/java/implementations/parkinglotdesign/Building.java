package implementations.parkinglotdesign;

import java.util.List;

public class Building {
    private List<Floors> floors;
    private String id;


    public Building(List<Floors> floors) {
        this.floors = floors;
    }

    public List<Floors> getFloors() {
        return floors;
    }

}
