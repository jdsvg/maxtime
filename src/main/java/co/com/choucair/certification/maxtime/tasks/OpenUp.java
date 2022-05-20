package co.com.choucair.certification.maxtime.tasks;

;
import co.com.choucair.certification.maxtime.userinterface.OpenUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private OpenUpPage automatizacion_heroku;

    public static Performable theMaxtimePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automatizacion_heroku));
    }
}