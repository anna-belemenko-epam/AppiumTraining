package scenarios.NativeTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import setup.DriverSetup;

@Test(groups = "native")
public class ContactManagerTests extends DriverSetup {

    @Test(description = "Android native test for clicking on 'Add Password' button")
    public void nativeTest() throws Exception {
        String app_package_name = "in.smartappcart.contactmanager:id/";
        By password_btn = By.id(app_package_name + "ll1");
        driver().findElement(password_btn).click();
        System.out.println("Simple appium test is done!");
    }
}
