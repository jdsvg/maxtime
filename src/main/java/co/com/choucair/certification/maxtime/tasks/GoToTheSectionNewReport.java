package co.com.choucair.certification.maxtime.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.maxtime.userinterface.GoToTheCreatePage.A_BUTTON_NEW_DETAIL_REPORT;
import static co.com.choucair.certification.maxtime.userinterface.GoToTheSectionNewReportPage.*;

public class GoToTheSectionNewReport implements Task {

    private String current_date_data_to_element;
    public GoToTheSectionNewReport(String current_date_data){
        this.current_date_data_to_element = current_date_data;
    }

    public static GoToTheSectionNewReport reportWith(String current_date){
        return Tasks.instrumented(GoToTheSectionNewReport.class, current_date);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(

                        Click.on(SEARCH_CURRENT_DATE), Click.on(SEARCH_CURRENT_DATE)
//                        ,Click.on(A_BUTTON_NEW_DETAIL_REPORT)

        );
    }
}
