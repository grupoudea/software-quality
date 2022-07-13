package co.com.udea.edu.EnterUdeaPortal.tasks;

import static co.com.udea.edu.EnterUdeaPortal.userinterfaces.EnterToLogin.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class EnterToPlatformLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_STUDENT, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_STUDENT)
        );
        Scroll.to(BTN_SCROLL).performAs(actor);
        actor.attemptsTo(WaitUntil.the(BTN_ENTER_PLATFORM,WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_ENTER_PLATFORM));


    }

    public static EnterToPlatformLogin with(){
        return Tasks.instrumented(EnterToPlatformLogin.class);
    }
}
