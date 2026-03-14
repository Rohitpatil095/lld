package implementations.parkinglotdesign.algos;

import implementations.parkinglotdesign.*;
import implementations.parkinglotdesign.constants.SpotType;

public class parkVehicle {

    private SpotType type;
    private Vehicle vehicle;
    private Building building;

    public  parkVehicle(SpotType type,Vehicle vehicle, Building building){
        this.type=type;
        this.vehicle=vehicle;
        this.building=building;
    }

    public void park(){
        for(Floor floor :building.getFloor()){
            for(ParkingSpot spot: floor.getSpots()){
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
            }
        }
    }


}
