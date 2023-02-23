package B066;

public class MilitaryTrack extends Track {

    Transmitter control = new Transmitter();
    Barrier militaryBarrier = new Barrier();

    ICommand barrierOpen = new OpenBarrierCommand(militaryBarrier);
    ICommand barrierClose = new CloseBarrierCommand(militaryBarrier);

    public MilitaryTrack(Track successor) {
        setSuccessor(successor);
    }

    public void passBorder(Vehicle vehicle) {
        //System.out.println("Military B066.Track Class: " + vehicle.getClass().toString());
        if (canHandleVehicle(vehicle, "class B066.MilitaryVehicle")) {
            control.setCommand(barrierOpen);
            control.pressButton();
            outputBarrierState();
            vehicle.setPassedBorderToTrue();
            System.out.println("B066.MilitaryTrack: B066.Vehicle passed");
            control.setCommand(barrierClose);
            control.pressButton();
            outputBarrierState();
        } else {
            super.passBorder(vehicle);
        }
    }


    public void outputBarrierState() {
        System.out.println(militaryBarrier.toString() + " state: " + militaryBarrier.getState());
    }
}