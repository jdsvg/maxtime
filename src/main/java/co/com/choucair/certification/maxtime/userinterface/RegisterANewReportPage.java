package co.com.choucair.certification.maxtime.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterANewReportPage extends PageObject {

    //    Boton para proyectos
    public static final IFrame I_FRAME = IFrame.withPath(By.className("dxpc-iFrame"));

    public static final Target TD_PROJECT = Target.the("Button to open popup for Proyecto").located(
//            By.xpath("//div[@id='Vertical_v6_MainLayoutEdit_xaf_l128_xaf_dviProyecto_Edit_Find_CD']")
            By.cssSelector("div#Content table tbody tr + tr table  tbody td#separatorCell + td table tbody div#CP  table tbody  div +div table +table tbody div +div +div +div table tbody td +td table tbody td div table tbody tr td +td table tbody tr td div + div")
    );

    public static final Target X_1_INPUT = Target.the("Div from the new popup").inIFrame(I_FRAME).located(
            By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I")
    );





    //    Input popUp
    public static final Target INPUT_POPUP = Target.the("Input to popup for Proyecto").located(
//            By.cssSelector("div#Dialog_UPEI + table tbody tbody tbody input")
            By.xpath("//input[@id='Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I']")
    );

    //     Span check select item
    public static final Target SPAN_CHECK_ITEM_POPUP = Target.the("Check popup for Proyecto").located(
            By.cssSelector("table.dxgvControl_Office2010Blue.GridView tbody tr + tr span")
    );


    //    Button div acept item
    public static final Target A_BUTTON_ACEPTP = Target.the("Button to accept the data").located(
            By.id("Dialog_actionContainerHolder_Menu_DXI0_T")
    );

}