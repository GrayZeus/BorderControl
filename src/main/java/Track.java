public class Track {
	private Track successor; //Nachfolger
	public void passBorder(Vehicle vehicle) {
		if(getSuccessor() != null){
			getSuccessor().passBorder(vehicle);
		}
		else{
			System.out.println("Error by passing Border in Track Class. Unable to find correct Track");
		}
	}

	public boolean canHandleVehicle(Vehicle vehicle, String vehicleType) {
		System.out.println("Track class: " + vehicle.getClass().toString());
		return (vehicle == null) || (vehicle.getClass().toString().equals(vehicleType));
	}

	public Track getSuccessor() {
		return successor;
	}

	public void setSuccessor(Track successor) {
		this.successor = successor;
	}
}