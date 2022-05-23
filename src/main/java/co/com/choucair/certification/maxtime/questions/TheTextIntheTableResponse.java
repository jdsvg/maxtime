package co.com.choucair.certification.maxtime.questions;

import co.com.choucair.certification.maxtime.model.MaxtimeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.util.List;

public class TheTextIntheTableResponse implements Question<Boolean> {



    private List<MaxtimeData> data_report_maxtime_in_table;

    public TheTextIntheTableResponse(List<MaxtimeData> data){
        this.data_report_maxtime_in_table= data;
    }


    public static TheTextIntheTableResponse is(List<MaxtimeData> data_report_maxtime){
        return new TheTextIntheTableResponse(data_report_maxtime);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
