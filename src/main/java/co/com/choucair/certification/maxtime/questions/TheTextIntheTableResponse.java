package co.com.choucair.certification.maxtime.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.maxtime.userinterface.RegisterANewReportPage.TD_ITEMS_LIST;
import static co.com.choucair.certification.maxtime.userinterface.TheTextIntheTableResponsePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TheTextIntheTableResponse implements Question<Boolean> {

    private String proyecto;
    private String servicio;
    private String tipo_hora;
    private String actividad;
    private String horas_ejecutadas;
    private String comentario;

    public TheTextIntheTableResponse(String proyecto, String servicio, String tipo_hora, String actividad, String horas_ejecutadas, String comentario){
             this.proyecto=proyecto;
             this.servicio=servicio;
             this.tipo_hora=tipo_hora;
             this.actividad=actividad;
             this.horas_ejecutadas=horas_ejecutadas;
             this.comentario=comentario;
    }

    public static TheTextIntheTableResponse is(String proyecto, String servicio, String tipo_hora, String actividad, String horas_ejecutadas, String comentario){
        return new TheTextIntheTableResponse(proyecto, servicio, tipo_hora, actividad, horas_ejecutadas, comentario);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(A_PROYECT,isVisible()).forNoMoreThan(20).seconds()
        );
        if(proyecto.equalsIgnoreCase(Text.of(A_PROYECT).viewedBy(actor).asString())
                && servicio.equalsIgnoreCase(Text.of(A_SERVICE).viewedBy(actor).asString())
                && tipo_hora.equalsIgnoreCase(Text.of(A_TYPE_HOUR).viewedBy(actor).asString())
                && actividad.equalsIgnoreCase(Text.of(A_ACTIVITY).viewedBy(actor).asString())
                && horas_ejecutadas.equalsIgnoreCase(Text.of(SPAN_HOURS).viewedBy(actor).asString())
                && comentario.equalsIgnoreCase(Text.of(SPAN_COMMENT).viewedBy(actor).asString())
        ){
            return true;
        }
        return false;
    }
}
