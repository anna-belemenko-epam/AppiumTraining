package scenarios.WebTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import setup.DriverSetup;

@Test(groups = "web")
public class WebTests extends DriverSetup {

    @Test(description = "Android web test for opening a site")
    public void webTest() throws Exception {
        driver().get(SUT);
        driverWait().until(ExpectedConditions.urlToBe(SUT+"/"));
        System.out.println("Opening of site is done!");
    }
}
