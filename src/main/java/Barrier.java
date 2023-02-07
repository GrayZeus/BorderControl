public class Barrier {

	private State state;

	public void open() {
		state = State.OPEN;
	}

	public void close() {
		state = State.CLOSED;
	}
}