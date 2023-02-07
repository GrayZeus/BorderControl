public class OpenBarrierCommand implements ICommand {

	private Barrier barrier;

	public void execute() {
		barrier.open();
	}

}