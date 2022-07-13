package co.com.udea.edu.EnterUdeaPortal.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.udea.edu.EnterUdeaPortal.userinterfaces.EnterToMeeting.*;


public class EnterToMeeting implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ENTER_MEETING, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_ENTER_MEETING)
        );
    }
    public static EnterToMeeting with(){
        return Tasks.instrumented(EnterToMeeting.class);
    }
}
