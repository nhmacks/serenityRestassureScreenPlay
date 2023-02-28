package com.interbank.pe.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/examples/returnuserdata.feature",
                glue = {"com.interbank.pe.stepdefinitions"})
public class ReturnUserDataRunner {
}
