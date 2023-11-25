package com.cura.herokuapp.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/features/MakeAppointment.feature",
        glue = "com.cura.herokuapp.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@MakeAppointment"
)

public class MakeAppointmentRunner {
}
