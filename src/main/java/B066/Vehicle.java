package B066;

public abstract class Vehicle {

    boolean passedBorder;

    public void setPassedBorderToTrue() {
        this.passedBorder = true;
    }

    public boolean isPassedBorder() {
        return passedBorder;
    }
}