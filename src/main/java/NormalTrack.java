public class NormalTrack extends Track {
    // here no special constructor, last element
    public void passBorder(Vehicle vehicle){
        //System.out.println("Normal Track Class: " + vehicle.getClass().toString());
        if(canHandleVehicle(vehicle, "class Car")){
            System.out.println("Boarder guard is checking for personal documents and checks the vehicle");
            System.out.println("NormalTrack: Vehicle passed");
        }
        else{
            super.passBorder(vehicle);
        }
    }
}