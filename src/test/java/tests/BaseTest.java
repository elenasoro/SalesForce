package tests;

import drivermanager.DriverFactory;
import drivermanager.DriverManager;
import drivermanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.TestListeners;

@Listeners(TestListeners.class)
public class BaseTest {
    protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    DriverManager driverManager;

    @BeforeMethod
    public void setUp() {
        DriverFactory driverFactory = new DriverFactory();
        driverManager = driverFactory.getManager(DriverType.CHROME);
        driverManager.createDriver();
        driverManager.setTimeout();
        driverManager.startMaximize();
        threadLocalDriver.set(driverManager.getDriver());
    }

    public WebDriver getDriver() {
        return threadLocalDriver.get();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();
    }

}
