package stepdetinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.UserWillNotSeeData;
import questions.ValidateCode;
import tasks.GetDataApiFromACountry;
import tasks.GetDataFromApi;
import utils.OwnDriver;

public class GeneralStepDefinitions {

    @Given("^call properties Api$")
    public void callPropertiesApi() {
        OwnDriver.setUp();
    }

    @When("^the user try to get data from API$")
    public void theUserTryToGetDataFromAPI() {
        OnStage.theActorInTheSpotlight().attemptsTo(GetDataFromApi.con());
    }

    @Then("^the user will watch a status code (.*)$")
    public void theUserWillWatchAStatusCode(int code) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateCode.resp(), Matchers.equalTo(code)));
    }

    @When("^the user consult a country equalts to (.*)$")
    public void theUserConsultACountryEqualtsToIndia(String country) {
        OnStage.theActorInTheSpotlight().attemptsTo(GetDataApiFromACountry.con(country));
    }

    @Then("^The user will not see data$")
    public void theUserWillNotSeeData() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(UserWillNotSeeData.resp(),Matchers.is(false)));
    }




}
