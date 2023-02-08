public class DiplomatsTrack extends Track {
    Transmitter control = new Transmitter();
    Barrier diplomatsBarrier = new Barrier();

    ICommand barrierOpen = new OpenBarrierCommand(diplomatsBarrier);
    ICommand barrierClose = new CloseBarrierCommand(diplomatsBarrier);


    public DiplomatsTrack(Track successor){
        setSuccessor(successor);
    }


    public void passBorder(Vehicle vehicle){
        //System.out.println("Diplomats Track Class: " + vehicle.getClass().toString());
        if(canHandleVehicle(vehicle, "class DiplomatsVehicle")){
            control.setCommand(barrierOpen);
            control.pressButton();
            outputBarrierState();
            System.out.println("DiplomatsTrack: Vehicle passed");
            control.setCommand(barrierClose);
            control.pressButton();
            outputBarrierState();
        }
        else{
            super.passBorder(vehicle);
        }
    }
    public void outputBarrierState(){
        System.out.println(diplomatsBarrier.toString() + " state: " + diplomatsBarrier.getState());
    }
}