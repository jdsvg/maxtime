package co.com.choucair.certification.maxtime.stepdefinitions;

import co.com.choucair.certification.maxtime.tasks.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import co.com.choucair.certification.maxtime.model.MaxtimeData;


public class ReportTimesInMaxtimeStepDefinitions {

//    BACKGROUND
    @Given("^than (.*) wants to register a new record in Maxtime$")
    public void thanJohnWantsToRegisterANewRecordtInMaxtime(String john){
        theActorCalled(john).wasAbleTo(OpenUp.theMaxtimePage());
    }

    @And("^he needs go to login with his credentials$")
    public void heNeedsGoToLoginWithHisCredentials(List<MaxtimeData> login_data){
        theActorInTheSpotlight().attemptsTo(Login.onThePageWith(login_data));
    }

//  Scenario
    @Given("^he go to select the record with the date of (.*)")
    public void heGoToSelectTheRecordWithTheDateOfCurrent_date(String current_date) {
        theActorInTheSpotlight().attemptsTo(GoToTheSectionNewReport.reportWith(current_date));
    }

    @And("^he go to create a new detailed report$")
    public void heGoToCreateANewDetailedReport(){
        theActorInTheSpotlight().attemptsTo(GoToTheCreate.newReport());
    }

    @When("^he is in the detailed report section he will fill in the fields$")
    public void heIsInTheDetailedReportSectionHeWillFillInTheFields(List<MaxtimeData> new_report_data){
        theActorInTheSpotlight().attemptsTo(RegisterANewReport.withThe(new_report_data));

    }
//
//    @Then("^he verifies the information in the new carving report record$")
//    public void heVerifiesTheInformationInTheNewCarvingReportRecord(){
//
//    }
//
//    @And("^he is going to close the day$")
//    public void heIsGoingToCloseTheDay(){
//
//    }

}
