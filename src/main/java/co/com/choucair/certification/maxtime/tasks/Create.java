package co.com.choucair.certification.maxtime.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.concurrent.TimeUnit;

import static co.com.choucair.certification.maxtime.userinterface.CreatePage.A_BUTTON_NEW_DETAIL_REPORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Create implements Task {

    public static Create report(){
        return Tasks.instrumented(Create.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(A_BUTTON_NEW_DETAIL_REPORT,isVisible()).forNoMoreThan(60).seconds()
                ,Click.on(A_BUTTON_NEW_DETAIL_REPORT)
        );
        try {
            TimeUnit.SECONDS.sleep(10);}
        catch (InterruptedException e) {e.printStackTrace();}
    }
}
