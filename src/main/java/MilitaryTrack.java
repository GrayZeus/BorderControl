public class MilitaryTrack extends Track {

    Transmitter control = new Transmitter();
    Barrier militaryBarrier = new Barrier();

    ICommand barrierOpen = new OpenBarrierCommand(militaryBarrier);
    ICommand barrierClose = new CloseBarrierCommand(militaryBarrier);

    public MilitaryTrack(Track successor){
        setSuccessor(successor);
    }
    public void passBorder(Vehicle vehicle){
        //System.out.println("Military Track Class: " + vehicle.getClass().toString());
        if(canHandleVehicle(vehicle, "class MilitaryVehicle")){
            control.setCommand(barrierOpen);
            control.pressButton();
            outputBarrierState();
            System.out.println("MilitaryTrack: Vehicle passed");
            control.setCommand(barrierClose);
            control.pressButton();
            outputBarrierState();
        }
        else{
            super.passBorder(vehicle);
        }
    }


    public void outputBarrierState(){
        System.out.println(militaryBarrier.toString() + " state: " + militaryBarrier.getState());
    }
}