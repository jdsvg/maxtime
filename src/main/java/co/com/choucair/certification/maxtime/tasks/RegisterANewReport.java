package co.com.choucair.certification.maxtime.tasks;

import co.com.choucair.certification.maxtime.interactions.SelectTypeItem;
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
        try {
            TimeUnit.SECONDS.sleep(10);}
        catch (InterruptedException e) {e.printStackTrace();}
        actor.attemptsTo(
                WaitUntil.the(TD_BUTTON_PROJECT,isVisible()).forNoMoreThan(20).seconds()
                ,Click.on(TD_BUTTON_PROJECT)
                ,WaitUntil.the(INPUT_POPUP,isVisible()).forNoMoreThan(20).seconds()
                ,Enter.theValue(new_report_data_to_form.get(0).getProyecto()).into(INPUT_POPUP)
                ,Click.on(DIV_BUTTON_SEARH_ITEM)
        );
        try {
            TimeUnit.SECONDS.sleep(2);}
        catch (InterruptedException e) {e.printStackTrace();}
        actor.attemptsTo(
                Click.on(SPAN_CHECK_ITEM_POPUP)
                ,Click.on(A_BUTTON_ACEPT_POPUP)

        );
        try {
            TimeUnit.SECONDS.sleep(2);}
        catch (InterruptedException e) {e.printStackTrace();}
        actor.attemptsTo(
//                    SelectTypeItem.laLista(TD_ITEMS_LIST, new_report_data_to_form.get(0).getTipo_hora(), true)
                    SelectTypeItem.laLista(TD_ITEMS_LIST, new_report_data_to_form.get(0).getServicio(), false,true)
        );
        try {
            TimeUnit.SECONDS.sleep(10);}
        catch (InterruptedException e) {e.printStackTrace();}
    }
}
