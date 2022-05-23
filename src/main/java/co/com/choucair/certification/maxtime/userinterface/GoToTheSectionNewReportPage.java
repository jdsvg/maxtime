package co.com.choucair.certification.maxtime.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class GoToTheSectionNewReportPage extends PageObject {

    public static final Target SEARCH_CURRENT_DATE = Target.the("pa una puta mierda").located(
            By.xpath("//table[@id='MT']//table[@id='MRC']//div[@id='CP']//div[@class='Item ListViewItem']//tbody//tbody//tr[2]//td[3]")
    );

    public static final Target SEARCH_CURRENT_DATE2 = Target.the("pa una puta mierda").located(
            By.cssSelector("div#Content table tbody tr + tr table  tbody td#separatorCell + td table tbody div#CP  table tbody div.Item.ListViewItem table  tbody  table tbody tr +tr td +td +td")
    );

}