package co.com.choucair.certification.maxtime.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.choucair.certification.maxtime.userinterface.GoToTheCreatePage.A_NEW_DETAIL_REPORT;
public class GoToTheCreate implements Task {

    public static GoToTheCreate newReport(){
        return Tasks.instrumented(GoToTheCreate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_NEW_DETAIL_REPORT)
        );
    }
}
