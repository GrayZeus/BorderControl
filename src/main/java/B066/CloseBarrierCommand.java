package B066;

public class CloseBarrierCommand implements ICommand {
    private final Barrier barrier;

    public CloseBarrierCommand(Barrier barrier) {
        this.barrier = barrier;
    }

    public void execute() {
        barrier.close();
    }

}