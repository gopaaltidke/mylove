package pageobjects.Login;


import dataobjects.LoginPageDataObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.base.BasePO;
import utilities.WaitHelper;

public class LoginPO extends BasePO {

    @FindBy(xpath = "//input[@type='text']//parent::td//input[@name='uid']")
    private WebElement UserName;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement PassWord;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement LoginButton;
    @FindBy(xpath = "//img[@src='/logo.png']")
    private WebElement loginLogo;

    @FindBy(xpath = "//input[@type='reset']")
    private WebElement resetButton;

//    private static By login = By.xpath("//input[@type='reset']");
    public LoginPO(WebDriver driver) {
        super(driver);
    }

    public void EnterValidCredentials(String Username, String Password) {

        selenium.enterText(UserName, Username, true);
        selenium.enterText(PassWord, Password, true);
        LoginButton.click();
    }

    public boolean VerifyLoginPageLogo() {
        return selenium.isElementPresent(loginLogo);
    }

    public void EnterInvalidCredentials(LoginPageDataObjects login) {
        selenium.enterText(UserName, login.getInvalidUserName(), true);
        selenium.enterText(PassWord, login.getInvalidPassword(), true);
        LoginButton.click();
        driver.switchTo().alert().accept();
    }

    public void EnterValidUserNameOnly(String Username) {

        selenium.enterText(UserName, Username, true);
        LoginButton.click();
    }

    public void EnterValidPasswordOnly(String Password) {
        selenium.enterText(PassWord, Password, true);
        LoginButton.click();

    }

    public void WithoutEnteringUsernameAndPassword() {
        LoginButton.click();
    }

    public void ResetButtonClearUsernameANdPasswordField(String Username, String Password) {
        selenium.enterText(UserName, Username, true);
        selenium.enterText(PassWord, Password, true);
        resetButton.click();
    }

}



