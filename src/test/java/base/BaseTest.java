package base;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.DriverManager;
import utilities.SeleniumHelper;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    protected WebDriver driver;
    protected SeleniumHelper selenium;
    private DriverManager drivermanager;


    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) {
        drivermanager = new DriverManager();
        driver = drivermanager.setUp(browser);
        selenium = new SeleniumHelper(driver);


    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        try {
            //capturing screenshot if failed

            if (ITestResult.FAILURE == result.getStatus()) {
                selenium.takeScreenshot(result.getName());
            }
        } catch (Exception e) {
            //  ignore
        }
 //    drivermanager.tearDown();
    }
}