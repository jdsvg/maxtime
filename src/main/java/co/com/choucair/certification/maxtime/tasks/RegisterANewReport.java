package co.com.choucair.certification.maxtime.tasks;

import co.com.choucair.certification.maxtime.interactions.SelectItem;
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
        actor.attemptsTo(
                WaitUntil.the(TD_BUTTON_PROJECT,isVisible()).forNoMoreThan(20).seconds()
                ,Click.on(TD_BUTTON_PROJECT)
                ,WaitUntil.the(INPUT_POPUP,isVisible()).forNoMoreThan(20).seconds()
                ,Enter.theValue(new_report_data_to_form.get(0).getProyecto()).into(INPUT_POPUP)
                ,Click.on(DIV_BUTTON_SEARH_ITEM_POPUP)
                ,Click.on(SPAN_SELECT_CHECK_ITEM_POPUP)
                ,WaitUntil.the(A_BUTTON_ACEPT_POPUP,isVisible()).forNoMoreThan(20).seconds()
                ,Click.on(A_BUTTON_ACEPT_POPUP)
        );
        try {TimeUnit.SECONDS.sleep(1);}
        catch (InterruptedException e) {e.printStackTrace();}
        actor.attemptsTo(
                WaitUntil.the(TD_ITEMS_LIST,isVisible()).forNoMoreThan(20).seconds()
                ,SelectTypeItem.type_items_list(TD_ITEMS_LIST, true,false)
                , SelectItem.items_list(TD_ITEMS_LIST,new_report_data_to_form.get(0).getTipo_hora())

                ,WaitUntil.the(TD_BUTTON_SERVICE,isVisible()).forNoMoreThan(20).seconds()
                ,Click.on(TD_BUTTON_SERVICE)
                ,WaitUntil.the(INPUT_POPUP,isVisible()).forNoMoreThan(20).seconds()
                ,Enter.theValue(new_report_data_to_form.get(0).getServicio()).into(INPUT_POPUP)
                ,Click.on(DIV_BUTTON_SEARH_ITEM_POPUP)
                ,Click.on(SPAN_SELECT_CHECK_ITEM_POPUP)
                ,WaitUntil.the(A_BUTTON_ACEPT_POPUP,isVisible()).forNoMoreThan(20).seconds()
                ,Click.on(A_BUTTON_ACEPT_POPUP)
        );
        actor.attemptsTo(
                WaitUntil.the(TD_ITEMS_LIST,isVisible()).forNoMoreThan(20).seconds()
                ,SelectTypeItem.type_items_list(TD_ITEMS_LIST, false,true)
                ,SelectItem.items_list(TD_ITEMS_LIST,new_report_data_to_form.get(0).getActividad())

                ,Enter.theValue(new_report_data_to_form.get(0).getHoras_ejecutadas()).into(INPUT_HOURS_EXECUTED)
                ,Enter.theValue(new_report_data_to_form.get(0).getComentario()).into(INPUT_COMMENT)

                ,Click.on(A_BUTTON_SAVE_AND_CLOSE)
        );
        try {TimeUnit.SECONDS.sleep(5);}
        catch (InterruptedException e) {e.printStackTrace();}
    }
}
