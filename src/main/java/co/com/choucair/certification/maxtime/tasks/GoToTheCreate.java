package co.com.choucair.certification.maxtime.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.certification.maxtime.userinterface.GoToTheCreatePage.A_BUTTON_NEW_DETAIL_REPORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToTheCreate implements Task {

    public static GoToTheCreate newReport(){
        return Tasks.instrumented(GoToTheCreate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(A_BUTTON_NEW_DETAIL_REPORT,isVisible()).forNoMoreThan(10).seconds()
                ,Click.on(A_BUTTON_NEW_DETAIL_REPORT)
        );
    }
}
