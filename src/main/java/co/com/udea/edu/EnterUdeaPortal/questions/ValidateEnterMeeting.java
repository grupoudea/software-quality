package co.com.udea.edu.EnterUdeaPortal.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class ValidateEnterMeeting implements Question {

    private static String message;

    @Managed
    WebDriver driver;



    @Override
    public Object answeredBy(Actor actor) {

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        message = alert.getText();
        alert.dismiss();

        return message;
    }

    public static ValidateEnterMeeting answered(){
        return new ValidateEnterMeeting();

    }

}
