package LoginTest;

import base.BaseTest;
import dataFacotory.LoginPageDataFactory;
import dataobjects.LoginPageDataObjects;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.Login.LoginPO;
import utilities.Constants;

import static utilities.Constants.URL;

public class LoginTest extends BaseTest {
    @Test(priority = 1)
    public void VerifyThatTheLogoIsDisplayed() {
        LoginPO login = new LoginPO(driver);
        selenium.navigateToPage(URL);
        Assert.assertTrue(login.VerifyLoginPageLogo(), "logo is not displayed");


    }

    @Test(priority = 2)
    public void VerifyLoginSuccessfully() {
        LoginPO login = new LoginPO(driver);
        selenium.navigateToPage(URL);
        Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page", "Title is not matched with Login Page Title");
        login.EnterValidCredentials(Constants.UserName, Constants.PassWord);
        Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage", "Title is not match");
        System.out.println(driver.getTitle());
    }

    @Test(priority = 3)
    public void VerifyThatValidationMessageDisplayedAfterEnteringInvalidCredentials() {
        LoginPO login = new LoginPO(driver);
        LoginPageDataObjects data = new LoginPageDataFactory().getLoginPageData();
        selenium.navigateToPage(URL);
        login.EnterInvalidCredentials(data);
    }

    @Test(priority = 4)
    public void VerifyThatValidationMessageDisplayedAfterEnteringValidUsernameOnly() {
        LoginPO login = new LoginPO(driver);
        selenium.navigateToPage(URL);
        login.EnterValidUserNameOnly(Constants.UserName);
    }

    @Test(priority = 5)
    public void VerifyThatValidationMessageDisplayedAfterEnteringValidPasswordOnly()  {
        LoginPO login = new LoginPO(driver);
        selenium.navigateToPage(URL);
        login.EnterValidPasswordOnly(Constants.PassWord);
    }

    @Test(priority = 6)
    public void VerifyThatValidationMessageDisplayedWithoutEnteringUsernameAndPassword(){
        LoginPO login = new LoginPO(driver);
        selenium.navigateToPage(URL);
        login.WithoutEnteringUsernameAndPassword();
    }

    @Test(priority = 7)
    public void VerifyThatClearUsernameAndPasswordField(){
        LoginPO login = new LoginPO(driver);
        selenium.navigateToPage(URL);
        login.ResetButtonClearUsernameANdPasswordField(Constants.UserName,Constants.PassWord);
    }
}
