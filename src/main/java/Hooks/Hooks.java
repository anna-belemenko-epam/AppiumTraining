package Hooks;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import setup.DriverSetup;
import setup.PropertyFile;

public class Hooks extends DriverSetup {

    protected Hooks(){ super(); }

    @BeforeSuite(groups = "native", description = "Prepare driver to run native test(s)")
    public void setUpNative() throws Exception {
        getCurrentProps(PropertyFile.NATIVE.getName());
        prepareDriver();
    }

    @BeforeSuite(groups = "web", description = "Prepare driver to run web test(s)")
    public void setUpWeb() throws Exception {
        getCurrentProps(PropertyFile.WEB.getName());
        prepareDriver();
    }

    @AfterSuite(groups = {"native", "web"}, description = "Close driver on all tests' completion")
    public void tearDown() throws Exception {
        driver().quit();
        System.out.println("Driver is closed");
    }
}
