package com.cura.herokuapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AppointmentUI {

    public static final Target MJS_LOGIN_VALIDATION = Target
            .the("Make Appointment Page Login Validation")
            .locatedBy("//h2[text()='Make Appointment']");

    public static final Target LST_FACILITY = Target
            .the("Facility Dropdown List")
            .locatedBy("//select[@id='combo_facility']");

    public static final Target TXT_VISITDATE = Target
            .the("Visit Date Input Field")
            .locatedBy("//input[@id='txt_visit_date']");

    public static final Target TXT_COMMENT = Target
            .the("Comment Text Area")
            .locatedBy("//textarea[@id='txt_comment']");

    public static final Target BTN_BOOK_APPOINTMENT = Target
            .the("Book Appointment Button")
            .locatedBy("//button[@id='btn-book-appointment']");


}
