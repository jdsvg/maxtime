package co.com.choucair.certification.maxtime.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectTypeItem implements Interaction {
    private Target lista;
    private String option;
    private boolean flag_tipo_hora;
    private boolean flag_actividad;

    public SelectTypeItem(Target lista, String option, boolean flag_type_hora, boolean flag_actividad){
        this.lista = lista;
        this.option = option;
        this.flag_tipo_hora = flag_type_hora;
        this.flag_actividad = flag_actividad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            List<WebElement> listObjeto = lista.resolveFor(actor).findElements(By.tagName("td"));
            List<WebElement> listObjeto2 = lista.resolveFor(actor).findElements(By.cssSelector("td + td tbody tbody table +div +table td+td+td"));
            for (int i = 0; i < listObjeto.size(); i++) {
                if (listObjeto.get(i).getText().equals("Tipo Hora:") && flag_tipo_hora) {
                    listObjeto2.get(0).click();
                    break;
                }else if(listObjeto.get(i).getText().equals("Actividad:") && (flag_actividad) ){
                    listObjeto2.get(1).click();
                    break;
                }

            }
    }


    public static SelectTypeItem type_items_list(Target lista, String option, boolean flag_tipo_hora, boolean flag_actividad){
        return new SelectTypeItem(lista, option, flag_tipo_hora, flag_actividad);
    }

}