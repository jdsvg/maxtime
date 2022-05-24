package co.com.choucair.certification.maxtime.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.maxtime.userinterface.RegisterANewReportPage.A_BUTTON_ACEPT_POPUP;
import static co.com.choucair.certification.maxtime.userinterface.GoToTheSectionNewReportPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class GoToTheSectionNewReport implements Task {

    public static GoToTheSectionNewReport reportWithLastDate() {
        return Tasks.instrumented(GoToTheSectionNewReport.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(SEARCH_CURRENT_DATE,isVisible()).forNoMoreThan(60).seconds()
                    ,WaitUntil.the(SEARCH_CURRENT_DATE,isEnabled()).forNoMoreThan(60).seconds()
                    ,WaitUntil.the(SEARCH_CURRENT_DATE,isCurrentlyEnabled()).forNoMoreThan(60).seconds()
                    ,Click.on(SEARCH_CURRENT_DATE)
            );
    }
}
