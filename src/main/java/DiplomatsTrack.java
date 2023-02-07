public class DiplomatsTrack extends Track {

    public void passBorder(Vehicle vehicle){
        System.out.println("Diplomats Track Class: " + vehicle.getClass().toString());
        if(canHandleVehicle(vehicle, "DiplomatsVehicle")){
            System.out.println("DiplomatsTrack: Vehicle passed");
        }
        else{
            super.passBorder(vehicle);
        }
    }
}