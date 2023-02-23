package B066;

public class NormalTrack extends Track {
    // here no special constructor, last element
    BorderGuard jeremy = new BorderGuard();

    Barrier barrierNormalTrack = new Barrier();

    public void passBorder(Vehicle vehicle) {
        //System.out.println("Normal B066.Track Class: " + vehicle.getClass().toString());
        if (canHandleVehicle(vehicle, "class B066.Car")) {
            System.out.println("Boarder guard is checking for personal documents and checks the vehicle");
            System.out.println("Boarder guard opens the barrier");
            barrierNormalTrack = jeremy.openBarrier(barrierNormalTrack);
            outputBarrierState();
            vehicle.setPassedBorderToTrue();
            System.out.println("B066.NormalTrack: B066.Vehicle passed");
            System.out.println("Boarder guard closes the barrier");
            barrierNormalTrack = jeremy.closeBarrier(barrierNormalTrack);
            outputBarrierState();
        } else {
            super.passBorder(vehicle);
        }
    }

    public void outputBarrierState() {
        System.out.println(barrierNormalTrack.toString() + " state: " + barrierNormalTrack.getState());
    }
}