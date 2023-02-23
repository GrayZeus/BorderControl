import B066.*;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

public class GivenDiplomatsVehicle extends Stage<GivenDiplomatsVehicle> {

    @ProvidedScenarioState
    DiplomatsVehicle dv1;

    @ProvidedScenarioState
    public Track carTrack = new NormalTrack();
    public Track militaryTrack = new MilitaryTrack(carTrack);
    public Track diplomatsTrack = new DiplomatsTrack(militaryTrack);

    public void getInitializedVehicle(){
        dv1 = new DiplomatsVehicle();
    }
}
