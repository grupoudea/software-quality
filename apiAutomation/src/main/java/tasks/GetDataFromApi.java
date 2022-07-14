package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static utils.ConstantsAPI.PATH;

public class GetDataFromApi implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(PATH).with(requestSpecification -> requestSpecification
                .param("name","Lovely Professional University")
                .param("state-province","Punjab").log().all()
        ));
    }

    public static GetDataFromApi con(){
        return Tasks.instrumented(GetDataFromApi.class);
    }
}
