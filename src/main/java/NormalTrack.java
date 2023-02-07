public class NormalTrack extends Track {

    public void passBorder(Vehicle vehicle){
        if(canHandleVehicle(vehicle, "")){
            System.out.println("NormalTrack: Vehicle passed");
        }
        else{
            super.passBorder(vehicle);
        }
    }
}