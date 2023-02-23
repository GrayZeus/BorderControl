import com.tngtech.jgiven.junit5.ScenarioTest;
import org.junit.jupiter.api.Test;

public class bddTestDiplomatsMilitary extends ScenarioTest<GivenDiplomatsVehicle, WhenDiplomatsVehicle, ThenDiplomatsVehicle> {
    @Test
    @Story("border control | pass border")
    public void passBorder(){
        given().getInitializedVehicle();
        when().passBorder();
        then().assertVehicleStateIsCorrect();
    }

}
