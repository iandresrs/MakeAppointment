package com.cura.herokuapp.tasks;

import com.cura.herokuapp.utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.cura.herokuapp.userInterfaces.HomeUI.BTN_MAKE_APPOINTMENT;
import static com.cura.herokuapp.userInterfaces.LoginUI.*;
import static com.cura.herokuapp.utils.Constants.CREDENTIALS_SHEET;

public class LoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        Excel excel = new Excel();

        String userName = excel.readExcelData(CREDENTIALS_SHEET, 1, 0);
        String password = excel.readExcelData(CREDENTIALS_SHEET, 1, 1);

        actor.attemptsTo(

                Click.on(BTN_MAKE_APPOINTMENT),
                Enter.theValue(userName).into(TXT_USERNAME),
                Enter.theValue(password).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)

        );
    }

    public static LoginTask on() {
        return Instrumented.instanceOf(LoginTask.class).withProperties();
    }

}
