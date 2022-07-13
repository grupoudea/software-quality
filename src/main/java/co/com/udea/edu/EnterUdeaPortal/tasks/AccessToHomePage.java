package co.com.udea.edu.EnterUdeaPortal.tasks;

import co.com.udea.edu.EnterUdeaPortal.models.PersonalInformation;
import static co.com.udea.edu.EnterUdeaPortal.userinterfaces.AccessToLogin.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class AccessToHomePage implements Task {
    List<PersonalInformation> personalInformationList;

    public AccessToHomePage (List<PersonalInformation> personalInformationList){
        this.personalInformationList = personalInformationList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USERNAME, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Enter.keyValues(this.personalInformationList.get(0).getUserName()).into(INPUT_USERNAME),
                Enter.keyValues(this.personalInformationList.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_ACCESS)

        );
    }
    public static AccessToHomePage with(List<PersonalInformation> personalInformationList){
        return Tasks.instrumented(AccessToHomePage.class, personalInformationList);
    }
}
