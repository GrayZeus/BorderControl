package B066;

public class OpenBarrierCommand implements ICommand {

    private final Barrier barrier;

    public OpenBarrierCommand(Barrier barrier) {
        this.barrier = barrier;
    }

    public void execute() {
        barrier.open();
    }

}