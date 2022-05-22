package co.com.choucair.certification.maxtime.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreatePage extends PageObject {

    public static final Target
            A_BUTTON_NEW_DETAIL_REPORT = Target.the("Name of the Bussnises Unit").located(
            By.cssSelector("div#Content table tbody tr + tr table  tbody td#separatorCell + td table tbody div#CP  table tbody div.Item.NestedFrameControl div div ul li div")
    );

}
