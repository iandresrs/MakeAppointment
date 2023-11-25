package com.cura.herokuapp.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/features/Login.feature",
        glue = "com.cura.herokuapp.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Login"
)

public class LoginRunner {
}
