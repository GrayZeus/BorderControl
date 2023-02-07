public class CloseBarrierCommand implements ICommand {

	private Barrier barrier;

	public void execute() {
		barrier.close();
	}

}