package com.cura.herokuapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target BTN_MAKE_APPOINTMENT = Target
            .the("Make AppointmentUI Button")
            .locatedBy("//a[@id='btn-make-appointment']");

}
