package implementations.parkinglotdesign;

import implementations.parkinglotdesign.constants.SpotType;

public class ParkingSpot {

    private String id;
    private SpotType spotType;
    private Floors floors;
    private ParkingLot parkingLot;
    private boolean isOccupied=false;
    private Vehicle parkedVehicle;

    // constructor, getters


    public ParkingSpot(SpotType spotType, Floors floors, ParkingLot parkingLot, Vehicle parkedVehicle) {
        this.spotType = spotType;
        this.floors = floors;
        this.parkingLot = parkingLot;
        this.parkedVehicle = parkedVehicle;
    }

    public String getId() {
        return id;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public Floors getFloor() {
        return floors;
    }

    public ParkingLot getBuilding() {
        return parkingLot;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public boolean park(Vehicle vehicle){
        if( isAvailable() && vehicle.getRequiredSpotSize()==getSpotType()){
            parkedVehicle=vehicle;
            isOccupied=true;
            return true;
        }
        return false;
    }
    public  void unpark(){
        this.parkedVehicle=null;
        isOccupied=false;
    };
    public boolean isAvailable(){
        return !this.isOccupied;
    }

}
