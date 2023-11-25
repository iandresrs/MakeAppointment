package com.cura.herokuapp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.cura.herokuapp.userInterfaces.SummaryUI.MJS_VALIDATION_APPOINTMENT;

public class ValidationAppointment implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MJS_VALIDATION_APPOINTMENT.resolveFor(actor).isVisible();
    }

    public static Question on(){
        return new ValidationAppointment();
    }
}
