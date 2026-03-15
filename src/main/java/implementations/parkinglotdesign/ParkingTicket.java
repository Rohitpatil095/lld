package implementations.parkinglotdesign;

public class ParkingTicket {
    private String id;
    private String spotID;
    private Vehicle vehicle;
    private int floorNumber;

    public ParkingTicket(String spotID, Vehicle vehicle, int floorNumber) {
        this.spotID = spotID;
        this.vehicle = vehicle;
        this.floorNumber = floorNumber;
    }

    public String getSpotID() {
        return spotID;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
