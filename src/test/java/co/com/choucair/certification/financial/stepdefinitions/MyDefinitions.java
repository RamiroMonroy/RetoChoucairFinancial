package co.com.choucair.certification.financial.stepdefinitions;

import co.com.choucair.certification.financial.interactions.OpenBrowser;
import co.com.choucair.certification.financial.model.DataUser;
import co.com.choucair.certification.financial.model.HomePage;
import co.com.choucair.certification.financial.questions.ValidateMessage;
import co.com.choucair.certification.financial.tasks.FillForm;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.certification.financial.util.Constants.ACTOR;
import static co.com.choucair.certification.financial.util.Constants.ZERO;

public class MyDefinitions {

    HomePage homePage;

    @Before
    public void startScenario(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR);
    }

    @Given("^the user is on the website$")
    public void theUserIsOnTheWebsite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.on(homePage));
    }

    @When("^enter the JOIN TODAY option for fill out the form$")
    public void enterTheJOINTODAYOptionForFillOutTheForm(List<DataUser> dataUser)  {
        OnStage.theActorInTheSpotlight().attemptsTo(FillForm.fillOut(dataUser.get(ZERO)));
    }

    @Then("^the user can see the welcome message (.*)$")
    public void theUserCanSeeTheWelcomeMessage(String message)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessage.validate(message)));
    }

}

