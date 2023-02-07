public class MilitaryTrack extends Track {

    public void passBorder(Vehicle vehicle){
        if(canHandleVehicle(vehicle, "")){
            System.out.println("MilitaryTrack: Vehicle passed");
        }
        else{
            super.passBorder(vehicle);
        }
    }
}