package co.com.choucair.certification.maxtime.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoToTheCreatePage extends PageObject {


    public static final Target
            A_BUTTON_NEW_DETAIL_REPORT = Target.the("Name of the Bussnises Unit").located(
                        By.id("Vertical_v3_MainLayoutView_xaf_l103_xaf_dviReporteDetallado_ToolBar_Menu_DXI0_T")
    );

}
