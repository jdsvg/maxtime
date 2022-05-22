package co.com.choucair.certification.maxtime.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterANewReportPage extends PageObject {

    public static final IFrame I_FRAME = IFrame.withPath(By.className("dxpc-iFrame"));

//    POPUP
    public static final Target INPUT_POPUP = Target.the("Input popUp-iframe").inIFrame(I_FRAME).located(
            By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I")
    );

    public static final  Target DIV_BUTTON_SEARH_ITEM_POPUP = Target.the("Div button thtat search the item in the popup").inIFrame(I_FRAME).located(
            By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_B_CD")
    );

    public static final  Target SPAN_SELECT_CHECK_ITEM_POPUP = Target.the("Div button thtat search the item in the popup").inIFrame(I_FRAME).located(
            By.cssSelector("div.Item.ListViewItem tbody tbody tr +tr span")
//            By.cssSelector("table.dxgvControl_Office2010Blue.GridView tbody tr + tr span")
    );

    public static final  Target A_BUTTON_ACEPT_POPUP = Target.the("Div button thtat search the item in the popup").inIFrame(I_FRAME).located(
            By.cssSelector("table.DialogContent.Content tbody tr#Dialog_TableRow3 li div a")
    );





    public static final Target TD_BUTTON_PROJECT = Target.the("Button to open popup for Proyecto").located(
            By.cssSelector("div#Content table tbody tr + tr table  tbody td#separatorCell + td table tbody div#CP  table tbody  div +div table +table tbody div +div +div +div table tbody td +td table tbody td div table tbody tr td +td table tbody tr td div + div")
    );

    public static final Target TD_BUTTON_SERVICE = Target.the("Button to open popup for Proyecto").located(
            By.cssSelector("td.HItem.FirstColumn.GroupContent div + div + div + div + div + div + div + div + div tbody tbody tbody tbody div +div")
    );

    public static final Target TD_ITEMS_LIST = Target.the("Items list that show de fields for the report").located(
            By.cssSelector("td.HItem.FirstColumn.GroupContent")
    );

    public static final Target INPUT_HOURS_EXECUTED = Target.the("Items list that show de fields for the report").located(
            By.cssSelector("  td.HItem.NextColumn.GroupContent div + div + div input")
    );

    public static final Target A_BUTTON_SAVE_AND_CLOSE = Target.the("Items list that show de fields for the report").located(
            By.cssSelector("a[title='Guardar y cerrar']")
    );



}