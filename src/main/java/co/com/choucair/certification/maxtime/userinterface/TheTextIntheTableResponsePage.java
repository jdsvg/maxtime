package co.com.choucair.certification.maxtime.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheTextIntheTableResponsePage extends PageObject {

    public static final Target TABLE_RESPONSE = Target.the("Table response").located(
            By.cssSelector("div#CP div.Item.ListViewItem table")
    );


}
