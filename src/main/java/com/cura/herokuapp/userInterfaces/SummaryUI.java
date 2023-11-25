package com.cura.herokuapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SummaryUI {

    public static final Target MJS_VALIDATION_APPOINTMENT = Target
            .the("Appointment Confirmation Header")
            .locatedBy("//h2[text()='Appointment Confirmation']");
}
