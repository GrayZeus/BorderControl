public class OpenBarrierCommand implements ICommand {

	private Barrier barrier;

	public OpenBarrierCommand(Barrier barrier){
		this.barrier = barrier;
	}

	public void execute() {
		barrier.open();
	}

}