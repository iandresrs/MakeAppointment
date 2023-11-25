package com.cura.herokuapp.stepDefinitions;

import com.cura.herokuapp.questions.ValidationAppointment;
import com.cura.herokuapp.tasks.AppointmentTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MakeAppointmentStepDefinition {

    @And("The user fills out the scheduling form.")
    public void theUserFillsOutTheSchedulingForm() {
        OnStage.theActorCalled("User")
                .attemptsTo(
                        AppointmentTask.on()
                );
    }
    @Then("the user will see the appointment confirmation message.")
    public void theUserWillSeeTheAppointmentConfirmationMessage() {
       OnStage.theActorCalled("User")
               .should(seeThat(
                       ValidationAppointment.on()
               ));
    }
}
