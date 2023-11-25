package com.cura.herokuapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target TXT_USERNAME = Target
            .the("Username input field")
            .locatedBy("//input[@id='txt-username']");

    public static final Target TXT_PASSWORD = Target
            .the("Password input field")
            .locatedBy("//input[@id='txt-password']");

    public static final Target BTN_LOGIN = Target
            .the("Password input field")
            .locatedBy("//button[@id='btn-login']");

}
