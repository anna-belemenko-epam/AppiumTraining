package scenarios.NativeTests;

import Utils.ADBCommandUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import setup.DriverSetup;

import static Utils.ADBCommands.inputShownCommand;
import static java.lang.System.*;
import static org.testng.Assert.*;

@Test(groups = "native")
public class ContactManagerTests extends DriverSetup {

    @Test(description = "Android native test for clicking on 'Add Password' button")
    public void nativeTest() throws Exception {
        String app_package_name = "in.smartappcart.contactmanager:id/";
        By password_btn = By.id(app_package_name + "ll1");
        By password_page_title = By.id(app_package_name + "texttitle1");
        By reset_button = By.id(app_package_name + "crreset");
        By submit_button = By.id(app_package_name + "crsubmit");
        driver().findElement(password_btn).click();
        assertEquals(driver().findElement(password_page_title).getText(), "Set a Password");
        assertTrue(driver().findElement(reset_button).isDisplayed());
        assertTrue(driver().findElement(submit_button).isDisplayed());
        out.println("Simple appium test is done!");
        assertTrue(ADBCommandUtils.execAndShowStatus(DEVICE_NAME, inputShownCommand));
    }
}
