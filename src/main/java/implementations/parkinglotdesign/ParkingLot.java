package implementations.parkinglotdesign;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class ParkingLot {
    private List<Floors> floors;
    private String id;
    private Map<String, ParkingTicket> activeTickets;
    private  final ReentrantLock[] floorLocks=new ReentrantLock[10];
    private  ParkingLot parkingLot;

    private ParkingLot() {}

    public ParkingLot getInstance(){
        if(parkingLot==null){
            synchronized (ParkingLot.class){
                if(parkingLot==null){

                    this.floors=new ArrayList<>();
                    parkingLot=new ParkingLot(){};
                }
            }
        }
        return parkingLot;
    }

    public List<Floors> getFloors() {
        return floors;
    }

    public boolean parkVehicle(Vehicle vehicle){
        if(loc)
        return false;
    }
    public  void unpark(){

    };

}
