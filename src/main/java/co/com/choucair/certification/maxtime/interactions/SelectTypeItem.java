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
            List<WebElement> listObjeto3 = lista.resolveFor(actor).findElements(By.cssSelector("td +td tbody tbody table+div+table+input+div table table+table tbody"));
            List<WebElement> listObjeto4 = lista.resolveFor(actor).findElements(By.cssSelector("td +td tbody tbody table+div+table+input+div table table+table tbody td"));
            List<WebElement> listObjeto5 = lista.resolveFor(actor).findElements(By.cssSelector("td#Vertical_v8_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_B-1"));
            for (int i = 0; i < listObjeto.size(); i++) {

                if (listObjeto.get(i).getText().equals("Tipo Hora:") && flag_tipo_hora) {
                    listObjeto2.get(0).click();

//                    --------------------------------
//                    for (int j = 0; j < listObjeto3.size(); j++) {
//                        for (int k = 0; k < listObjeto4.size(); k++) {
//                            if (listObjeto4.get(k).getText().equals(option)) {
//                                listObjeto4.get(k).click();
//                                break;
//                            }
//
//                        }
//                        break;
//                    }
//                    --------------------------------



                    break;

                }else if(listObjeto.get(i).getText().equals("Actividad:") && (flag_actividad) ){
                    System.out.println("XXXXXXXXXXXX");
                    System.out.println(listObjeto.get(i).getText());
                    System.out.println(listObjeto2.get(0).getTagName());
                    System.out.println(listObjeto2.get(0).getLocation());
                    System.out.println(listObjeto2.get(0).getClass());
                    System.out.println(listObjeto2.get(0).getSize());
                    System.out.println(listObjeto2.get(0).getRect());
                    System.out.println("XXXXXXXXXXXX");

                    listObjeto5.get(0).click();
                    break;
                }

            }
    }


    public static SelectTypeItem laLista(Target lista, String option, boolean flag_tipo_hora,boolean flag_actividad){
        return new SelectTypeItem(lista, option, flag_tipo_hora, flag_actividad);
    }

}