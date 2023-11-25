package com.cura.herokuapp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.cura.herokuapp.userInterfaces.AppointmentUI.MJS_LOGIN_VALIDATION;

public class ValidateLogin implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MJS_LOGIN_VALIDATION.resolveFor(actor).isVisible();
    }

    public static Question on(){
        return new ValidateLogin();
    }
}
