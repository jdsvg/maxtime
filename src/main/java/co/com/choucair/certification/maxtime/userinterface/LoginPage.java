package co.com.choucair.certification.maxtime.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
    public static final Target INPUT_EMAIL = Target.the("Input where  do we write the email")
            .located(By.id("Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I"));

    public static final Target INPUT_PASSWORD = Target.the("Input where  do we write the password")
            .located(By.id("Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I"));

    public static final Target DIV_BUTTON_LOGIN = Target.the("Button to  sing in the page")
            .located(By.id("Logon_PopupActions_Menu_DXI0_T"));


}
