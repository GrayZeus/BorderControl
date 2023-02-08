public class CloseBarrierCommand implements ICommand {
	private Barrier barrier;

	public CloseBarrierCommand(Barrier barrier){
		this.barrier = barrier;
	}

	public void execute() {
		barrier.close();
	}

}