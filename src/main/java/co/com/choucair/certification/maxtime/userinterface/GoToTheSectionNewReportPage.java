package co.com.choucair.certification.maxtime.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class GoToTheSectionNewReportPage extends PageObject {
    public static final Target SEARCH_CURRENT_DATE = Target.the("Name of the Bussnises Unit").located(
            By.cssSelector("tr#Vertical_v1_LE_v2_DXDataRow0 span.ValueViewControlClass")
    );

}
