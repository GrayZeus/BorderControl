package B066;

public class Track {
    private Track successor; //Nachfolger/Follower engl. successor

    public void passBorder(Vehicle vehicle) {
        if (getSuccessor() != null) {
            getSuccessor().passBorder(vehicle);
        } else {
            System.out.println("Error by passing Border in B066.Track Class. Unable to find correct B066.Track");
        }
    }

    public boolean canHandleVehicle(Vehicle vehicle, String vehicleType) {
        //System.out.println("B066.Track class: " + vehicle.getClass().toString());
        return (vehicle == null) || (vehicle.getClass().toString().equals(vehicleType));
    }

    public Track getSuccessor() {
        return successor;
    }

    public void setSuccessor(Track successor) {
        this.successor = successor;
    }

}