package com.cura.herokuapp.stepDefinitions;

import com.cura.herokuapp.questions.ValidateLogin;
import com.cura.herokuapp.tasks.LoginTask;
import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class LoginStepDefinition {

    @Before
    public void Configuration() {
        setTheStage(new OnlineCast());
    }

    @Given("user is on the website")
    public void userIsOnTheWebsite() {
        OnStage.theActorCalled("User")
                .attemptsTo(
                        Open.url("https://katalon-demo-cura.herokuapp.com/")
                );
    }

    @When("user enters his credentials")
    public void userEntersHisCredentials() {
        OnStage.theActorCalled("User")
                .attemptsTo(
                        LoginTask.on()
                );
    }

    @Then("the user will see the text Make Appointment")
    public void theUserWillSeeTheTextMakeAppointment() {
        OnStage.theActorCalled("User")
                .should(seeThat(
                        ValidateLogin.on()
                ));
    }

}
