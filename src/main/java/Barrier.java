public class Barrier {

	private State state;

	public State getState() {
		return state;
	}

	public void open() {
		state = State.OPEN;
	}

	public void close() {
		state = State.CLOSED;
	}
}