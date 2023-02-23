import B066.DiplomatsVehicle;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.assertj.core.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThenDiplomatsVehicle extends Stage<GivenDiplomatsVehicle> {

    @ExpectedScenarioState
    DiplomatsVehicle dv1;

    public void assertVehicleStateIsCorrect(){
        Assertions.assertThat(dv1.isPassedBorder() == true);
    }
}
