package co.com.udea.edu.EnterUdeaPortal.tasks;

import static co.com.udea.edu.EnterUdeaPortal.userinterfaces.SoftwareQualityCourse.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectSoftwareQualityCourse implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_COURSE_SQC, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_COURSE_SQC),
                WaitUntil.the(BTN_ENTER_VIRTUALT,WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_ENTER_VIRTUALT));
    }

    public static SelectSoftwareQualityCourse with(){
        return Tasks.instrumented(SelectSoftwareQualityCourse.class);
    }
}
