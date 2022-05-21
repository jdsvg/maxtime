package co.com.choucair.certification.maxtime.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.concurrent.TimeUnit;

import static co.com.choucair.certification.maxtime.userinterface.GoToTheCreatePage.A_BUTTON_NEW_DETAIL_REPORT;


public class Create implements Task {

    public static Create report (){
        return Tasks.instrumented(Create.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_BUTTON_NEW_DETAIL_REPORT)
        );
    }
}
