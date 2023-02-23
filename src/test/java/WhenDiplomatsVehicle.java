import B066.*;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ScenarioState;

public class WhenDiplomatsVehicle extends Stage<GivenDiplomatsVehicle> {

    @ScenarioState
    DiplomatsVehicle dv1;
    public Track diplomatsTrack;


    public void passBorder(){
        Track carTrack = new NormalTrack();
        Track militaryTrack = new MilitaryTrack(carTrack);
        diplomatsTrack = new DiplomatsTrack(militaryTrack);
        diplomatsTrack.passBorder(dv1);
    }

}
