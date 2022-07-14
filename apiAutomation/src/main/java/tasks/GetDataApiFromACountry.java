package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static utils.ConstantsAPI.PATH;

public class GetDataApiFromACountry implements Task {

    private String country;
    public GetDataApiFromACountry(String country){
        this.country = country;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(PATH).with(requestSpecification -> requestSpecification
                .param("country",country).log().all()
        ));

    }
    public static GetDataApiFromACountry con(String country){
        return Tasks.instrumented(GetDataApiFromACountry.class,country);
    }
}
