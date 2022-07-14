package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateCode implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        System.out.println(SerenityRest.lastResponse().statusCode());
        System.out.println(SerenityRest.lastResponse().statusLine());
        System.out.println(SerenityRest.lastResponse().getStatusCode());
        System.out.println(SerenityRest.lastResponse().jsonPath().prettyPrint());

        return SerenityRest.lastResponse().statusCode();
    }

    public static ValidateCode resp(){
        return new ValidateCode();
    }
}
