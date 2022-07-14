package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class UserWillNotSeeData implements Question {

    private boolean flag=false;
    @Override
    public Object answeredBy(Actor actor) {
        System.out.println(SerenityRest.lastResponse().statusCode());
        System.out.println(SerenityRest.lastResponse().statusLine());
        System.out.println(SerenityRest.lastResponse().getStatusCode());

        if (SerenityRest.lastResponse().jsonPath().getString("country").isEmpty()){
            flag =true;
        }

        return flag;
    }
    public static UserWillNotSeeData resp(){
        return new UserWillNotSeeData();
    }
}
