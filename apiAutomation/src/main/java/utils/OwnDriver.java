package utils;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import static utils.ConstantsAPI.END_POINT;


public class OwnDriver {

    public static void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(CallAnApi.at(END_POINT)));
        OnStage.theActorCalled("user");
        SerenityRest.useRelaxedHTTPSValidation();
    }

}
