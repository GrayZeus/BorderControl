public class DiplomatsTrack extends Track {

    public void passBorder(Vehicle vehicle){
        if(canHandleVehicle(vehicle)){
            System.out.println("DiplomatsTrack: Vehicle passed");
        }
        else{
            super.passBorder(vehicle);
        }
    }
}