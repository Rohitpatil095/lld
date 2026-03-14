package implementations.parkinglotdesign;

import implementations.parkinglotdesign.constants.SpotType;

public class ParkingSpot {

    private String id;
    private SpotType spotType;
    private Object floor;
    private Object building;
    private boolean isOccupied=false;
    private Vehicle parkedVehicle;

    // constructor, getters


    public ParkingSpot(SpotType spotType, Object floor, Object building, Vehicle parkedVehicle) {
        this.spotType = spotType;
        this.floor = floor;
        this.building = building;
        this.parkedVehicle = parkedVehicle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public Object getFloor() {
        return floor;
    }

    public void setFloor(Object floor) {
        this.floor = floor;
    }

    public Object getBuilding() {
        return building;
    }

    public void setBuilding(Object building) {
        this.building = building;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }
}
