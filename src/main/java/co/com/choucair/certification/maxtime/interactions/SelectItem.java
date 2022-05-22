package co.com.choucair.certification.maxtime.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectItem implements Interaction{
    private Target lista;
    private String option;

    public SelectItem(Target lista, String option){
        this.lista = lista;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listObjeto3 = lista.resolveFor(actor).findElements(By.cssSelector("td +td tbody tbody table+div+table+input+div table table+table tbody"));
        List<WebElement> listObjeto4 = lista.resolveFor(actor).findElements(By.cssSelector("td +td tbody tbody table+div+table+input+div table table+table tbody td"));
                    for (int j = 0; j < listObjeto3.size(); j++) {
                        for (int k = 0; k < listObjeto4.size(); k++) {
                            if (listObjeto4.get(k).getText().equals(option)) {
                                listObjeto4.get(k).click();
                                break;
                            }
                        }
                        break;
                    }

    }

    public static SelectItem items_list(Target lista, String option){
        return new SelectItem(lista, option);
    }

}
