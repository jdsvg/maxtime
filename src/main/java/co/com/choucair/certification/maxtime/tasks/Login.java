package co.com.choucair.certification.maxtime.tasks;

import co.com.choucair.certification.maxtime.model.MaxtimeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.maxtime.userinterface.LoginPage.*;
import java.util.List;

public class Login implements Task {

    private List<MaxtimeData> login_data_to_form;

    public Login(List<MaxtimeData> data){this.login_data_to_form=data;}

    public static Login onThePageWith(List<MaxtimeData> login_data){
        return Tasks.instrumented(Login.class, login_data);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(login_data_to_form.get(0).getUsername()).into(INPUT_EMAIL)
                ,Enter.theValue(login_data_to_form.get(0).getPassword()).into(INPUT_PASSWORD)
                , Click.on(DIV_BUTTON_LOGIN)
        );
    }
}
