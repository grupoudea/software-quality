package co.com.udea.udea.EnterUdeaPortal.stepdefinitions;

import co.com.udea.edu.EnterUdeaPortal.utils.OwnWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ReportGeneralStepDefinitions {

    @Before
    public void init(){setTheStage(new Cast());}

    @Given("^the student enter to main page$")
    public void theStudentEnterToMainPage(){
        theActorCalled("student").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("https://udearroba.udea.edu.co/home")));
    }

}
