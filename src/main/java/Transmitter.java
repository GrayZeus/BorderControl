public class Transmitter {

    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        System.out.println("Transmitter Button has been pressed!");
        command.execute();
    }
}