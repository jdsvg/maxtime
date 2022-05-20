package co.com.choucair.certification.maxtime.tasks;

import co.com.choucair.certification.maxtime.model.MaxtimeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.certification.maxtime.userinterface.RegisterANewReportPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegisterANewReport implements Task {

    private List<MaxtimeData> new_report_data_to_form;
    public RegisterANewReport(List<MaxtimeData> data){
        this.new_report_data_to_form=data;
    }

    public static RegisterANewReport withThe(List<MaxtimeData> new_report_data){
        return Tasks.instrumented(RegisterANewReport.class, new_report_data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TD_PROJECT,isVisible()).forNoMoreThan(20).seconds()
                ,Click.on(TD_PROJECT)
//                ,WaitUntil.the(X_1,isVisible()).forNoMoreThan(20).seconds()
//                ,Click.on(X_1)
//                ,WaitUntil.the(INPUT_POPUP,isVisible()).forNoMoreThan(10).seconds()
//                ,Click.on(INPUT_POPUP)
////                ,Click.on(INPUT_POPUP)
//                ,Enter.theValue(new_report_data_to_form.get(0).getProyecto()).into(INPUT_POPUP)
//                ,WaitUntil.the(SPAN_CHECK_ITEM_POPUP,isVisible()).forNoMoreThan(10).seconds()
//                ,Click.on(SPAN_CHECK_ITEM_POPUP)
//                ,Click.on(A_BUTTON_ACEPTP)

        );
        try {
            TimeUnit.SECONDS.sleep(10);}
        catch (InterruptedException e) {e.printStackTrace();}
    }
}
