package co.com.choucair.certification.maxtime.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheTextIntheTableResponsePage extends PageObject {

    public static final Target A_PROYECT = Target.the("Table response").located(
            By.cssSelector("div#CP div.Item.ListViewItem table table tr +tr a")
    );
    public static final Target A_SERVICE = Target.the("Table response").located(
            By.cssSelector("div#CP div.Item.ListViewItem table table tr + tr td+td+td+td+td+td a")
    );

    public static final Target A_TYPE_HOUR = Target.the("Table response").located(
            By.cssSelector("div#CP div.Item.ListViewItem table table tr + tr td+td+td+td+td+td+td a")
    );

    public static final Target A_ACTIVITY = Target.the("Table response").located(
            By.cssSelector("div#CP div.Item.ListViewItem table table tr + tr td+td+td+td+td+td+td+td a")
    );

    public static final Target SPAN_HOURS = Target.the("Table response").located(
            By.cssSelector("div#CP div.Item.ListViewItem table table tr + tr td+td+td+td+td+td+td+td+td+td span")
    );

    public static final Target SPAN_COMMENT = Target.the("Table response").located(
            By.cssSelector("div#CP div.Item.ListViewItem table table tr + tr td+td+td+td+td+td+td+td+td+td+td+td+td span")
    );
}
