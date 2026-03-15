package implementations.parkinglotdesign.algos;

import implementations.parkinglotdesign.*;
import implementations.parkinglotdesign.constants.SpotType;

import java.util.concurrent.locks.ReentrantLock;

public class parkVehicle {

    private SpotType type;
    private Vehicle vehicle;
    private Building building;
    private ReentrantLock lock;

    public  parkVehicle(SpotType type,Vehicle vehicle, Building building, ReentrantLock lock){
        this.type=type;
        this.vehicle=vehicle;
        this.building=building;
        this.lock=lock;
    }

    public void park(){

        for(Floors floors :building.getFloor()){
            for(ParkingSpot spot: floors.getSpots()){
                if(!lock.tryLock()){
                    return;
                }
                try(lock.lock()){

                    if(spot.isOccupied()){
                        if(vehicle.getVehicleType().equals("MOTORCYCLE") ){
                            if(spot.getSpotType().equals("SMALL")){
                                spot.setParkedVehicle(vehicle);
                                spot.setOccupied(true);
                                return;
                            }
                        }else if(vehicle.getVehicleType().equals("CAR") ){
                            if(spot.getSpotType().equals("MEDIUM") ){
                                spot.setParkedVehicle(vehicle);
                                spot.setOccupied(true);
                                return;
                            }
                        }else if(vehicle.getVehicleType().equals("TRUCK") ){
                            if(spot.getSpotType().equals("LARGE")){
                                spot.setParkedVehicle(vehicle);
                                spot.setOccupied(true);
                                return;
                            }
                        }
                    }
                }finally {
                    lock.unlock();
                }
            }
        }
    }


}
