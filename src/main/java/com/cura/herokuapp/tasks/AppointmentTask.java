package com.cura.herokuapp.tasks;

import com.cura.herokuapp.utils.Excel;
import com.ibm.icu.text.SelectFormat;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static com.cura.herokuapp.userInterfaces.AppointmentUI.*;
import static com.cura.herokuapp.utils.Constants.MAKE_APPOINTMENT_SHEET;

public class AppointmentTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Excel excel = new Excel();

        String facility = excel.readExcelData(MAKE_APPOINTMENT_SHEET,1,0);
        String visitDate = excel.readExcelData(MAKE_APPOINTMENT_SHEET,1,4);
        String comment =  excel.readExcelData(MAKE_APPOINTMENT_SHEET,1,5);

        actor.attemptsTo(

                SelectFromOptions.byValue(facility).from(LST_FACILITY),
                Enter.theValue(visitDate).into(TXT_VISITDATE).thenHit(Keys.ENTER),
                Enter.theValue(comment).into(TXT_COMMENT),
                Click.on(BTN_BOOK_APPOINTMENT)

        );
    }

    public static AppointmentTask on(){
        return Instrumented.instanceOf(AppointmentTask.class).withProperties();
    }
}
