package co.com.choucair.certification.maxtime.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.concurrent.TimeUnit;

import static co.com.choucair.certification.maxtime.userinterface.GoToTheSectionNewReportPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToTheSectionNewReport implements Task {

    private String current_date_data_to_element;

    public GoToTheSectionNewReport(String current_date_data) {
        this.current_date_data_to_element = current_date_data;
    }

    public static GoToTheSectionNewReport reportWith(String current_date) {
        return Tasks.instrumented(GoToTheSectionNewReport.class, current_date);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            TimeUnit.SECONDS.sleep(2);
            actor.attemptsTo(
                    WaitUntil.the(SEARCH_CURRENT_DATE, isVisible()).forNoMoreThan(60).seconds()
                    ,Click.on(SEARCH_CURRENT_DATE)
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
