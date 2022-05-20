package co.com.choucair.certification.maxtime.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/report_times_in_maxtime.feature",
        glue = {"co.com.choucair.certification.maxtime.stepdefinitions","co.com.choucair.certification.maxtime.util"},
        snippets = SnippetType.CAMELCASE)
public class Runner {}