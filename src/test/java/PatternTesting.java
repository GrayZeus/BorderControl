import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatternTesting {
    DiplomatsVehicle dv1;
    MilitaryVehicle mv1;
    Car c1;
    Track carTrack;
    Track militaryTrack;
    Track diplomatsTrack;

    @BeforeEach
    public void setUp() {
        dv1 = new DiplomatsVehicle();
        mv1 = new MilitaryVehicle();
        c1 = new Car();
        carTrack = new NormalTrack();
        militaryTrack = new MilitaryTrack(carTrack);
        diplomatsTrack = new DiplomatsTrack(militaryTrack);
    }

    @Test
    public void checkChainOfResponsibility() {
        //check can handle Method:
        assertTrue(diplomatsTrack.canHandleVehicle(null, "test"));
        assertTrue(diplomatsTrack.canHandleVehicle(dv1, "class DiplomatsVehicle"));
        assertTrue(diplomatsTrack.canHandleVehicle(mv1, "class MilitaryVehicle"));
        assertTrue(diplomatsTrack.canHandleVehicle(c1, "class Car"));
        assertFalse(diplomatsTrack.canHandleVehicle(dv1, "sedfgerzh"));
    }//end method

    @Test
    public void checkCommand() {
        Transmitter control = new Transmitter();
        Barrier barrier = new Barrier();
        ICommand barrierOpen = new OpenBarrierCommand(barrier);
        ICommand barrierClose = new CloseBarrierCommand(barrier);

        control.setCommand(barrierOpen);
        control.pressButton();
        State testState = barrier.getState();

        assertEquals("OPEN", testState.toString());

        control.setCommand(barrierClose);
        control.pressButton();
        testState = barrier.getState();
        assertEquals("CLOSED", testState.toString());
    }//end method
}
