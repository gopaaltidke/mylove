package pageobjects.managerPO;

import dataobjects.DashboardPageDataObjects;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import pageobjects.base.BasePO;
import utilities.Constants;

import java.awt.color.ICC_ColorSpace;
import java.time.Duration;

public class ManagerPO01 extends BasePO {

    public ManagerPO01(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//td[@style='color: green']")
    private WebElement ManagerId;
    @FindBy(xpath = "//li//a[contains(text(),'New Customer')]")
    private WebElement CreateAccount;
    @FindBy(xpath = "//input[@type='text']/parent::td//input[@name='name']")
    private WebElement CustomerName;

    @FindBy(xpath = "//input[@type='radio']/parent::td//input[@value='m']")
    private WebElement SelectGender;
    @FindBy(xpath = "//td//textarea[@rows='5']")
    private WebElement Address;
    //calendar
    @FindBy(xpath = "//input[@name='dob']")
    private WebElement DOB;
    @FindBy(xpath = "//input[@type='text']/parent::td//input[@name='city']")
    private WebElement city;
    @FindBy(xpath = "//input[@type='text']/parent::td//input[@name='state']")
    private WebElement state;
    @FindBy(xpath = "//input[@type='text']/parent::td//input[@name='pinno']")
    private WebElement pinno;
    @FindBy(xpath = "//input[@type='text']/parent::td//input[@name='telephoneno']")
    private WebElement mobile;
    @FindBy(xpath = "//input[@type='text']/parent::td//input[@name='emailid']")
    private WebElement emailId;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id='customer']/tbody/tr[4]/td[2]")
    private WebElement CustomerId;

    @FindBy(xpath = "//div//ul[@class='menusubnav']//a[contains(text(),'Delete Customer')]")
    private WebElement DeleteAccountButton;
    @FindBy(xpath = "//a[contains(text(),'Delete Account')]")
    private WebElement DeleteAccountButton1;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement enterCustomerId;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement enterAccountNo;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement DeleteAccountSubmitButton;


    @FindBy(xpath = "//a[contains(text(),'New Account')]")
    private WebElement createNewAccountButton;

    @FindBy(name = "cusid")
    private WebElement EnterCustomerId;

    @FindBy(xpath = "//select[@name='selaccount']//option")
    private WebElement SelectAccountType1;

    @FindBy(xpath = "//input[@name='inideposit']")
    private WebElement enterInitialAccount;

    @FindBy(xpath = "//*[@id=\"account\"]/tbody/tr[4]/td[2]")
    private WebElement Accountid;
    @FindBy(name = "AccSubmit") private WebElement AccSubmitButton;

    public void VerifyManagerId() {
        String ActualText = ManagerId.getText();
      String ExpectedText = Constants.ManagerId;
        //Assert.assertEquals(ActualText, ExpectedText);
     //   Reporter.log(ActualText + ExpectedText);
    }

    public void VerifythatCreateNewFormm(DashboardPageDataObjects dashboard){
        CreateAccount.click();
        selenium.enterText(CustomerName, dashboard.getCustomer_Name(), true);
        selenium.enterText(Address, dashboard.getAddress(), true);
        selenium.enterText(city, dashboard.getCity(), true);
        selenium.enterText(DOB, dashboard.getDOB(), true);
        selenium.enterText(state, dashboard.getState(), true);
        selenium.enterText(pinno, dashboard.getPinNo(), true);
        selenium.enterText(mobile, dashboard.getMobileNo(), true);
        selenium.enterText(emailId, dashboard.getEmail(), true);
        selenium.enterText(password, dashboard.getPassword(), true);
        submitButton.click();
        String CustomerId1 = selenium.getText(CustomerId);
        System.out.println(CustomerId1);
        try {
            continueButton.click();
            System.out.println("Account Created Successfully");
        } catch (Throwable t) {
            System.out.println("Account Already created or not created successfully");
        }
    }
    public void VerifyThatCreateNewAccountt(DashboardPageDataObjects dashboard){
        CreateAccount.click();
        selenium.enterText(CustomerName, dashboard.getCustomer_Name(), true);
        selenium.enterText(Address, dashboard.getAddress(), true);
        selenium.enterText(city, dashboard.getCity(), true);
        selenium.enterText(DOB, dashboard.getDOB(), true);
        selenium.enterText(state, dashboard.getState(), true);
        selenium.enterText(pinno, dashboard.getPinNo(), true);
        selenium.enterText(mobile, dashboard.getMobileNo(), true);
        selenium.enterText(emailId, dashboard.getEmail(), true);
        selenium.enterText(password, dashboard.getPassword(), true);
        submitButton.click();
        String CustomerId1 = selenium.getText(CustomerId);
        System.out.println(CustomerId1);
        try {
            continueButton.click();
            System.out.println("Account Created Successfully");
        } catch (Throwable t) {
            System.out.println("Account Already created or not created successfully");
        }
    }
    public void VerifyCreateAccountFormAndDeleteAccountForm(DashboardPageDataObjects dashboard) {
        CreateAccount.click();
        selenium.enterText(CustomerName, dashboard.getCustomer_Name(), true);
        selenium.enterText(Address, dashboard.getAddress(), true);
        selenium.enterText(city, dashboard.getCity(), true);
        selenium.enterText(DOB, dashboard.getDOB(), true);
        selenium.enterText(state, dashboard.getState(), true);
        selenium.enterText(pinno, dashboard.getPinNo(), true);
        selenium.enterText(mobile, dashboard.getMobileNo(), true);
        selenium.enterText(emailId, dashboard.getEmail(), true);
        selenium.enterText(password, dashboard.getPassword(), true);
        submitButton.click();
        String CustomerId1 = selenium.getText(CustomerId);
        System.out.println(CustomerId1);
        try {
            continueButton.click();
            System.out.println("Account Created Successfully");
        } catch (Throwable t) {
            System.out.println("Account Already created or not created successfully");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        DeleteAccountButton.click();
        selenium.enterText(enterCustomerId, CustomerId1, true);
        DeleteAccountSubmitButton.click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
    }

    public void VerifyCreateAccountAndDeleteAccount(DashboardPageDataObjects dashboard) {
        CreateAccount.click();
        selenium.enterText(CustomerName, dashboard.getCustomer_Name(), true);
        selenium.enterText(Address, dashboard.getAddress(), true);
        selenium.enterText(city, dashboard.getCity(), true);
        selenium.enterText(DOB, dashboard.getDOB(), true);
        selenium.enterText(state, dashboard.getState(), true);
        selenium.enterText(pinno, dashboard.getPinNo(), true);
        selenium.enterText(mobile, dashboard.getMobileNo(), true);
        selenium.enterText(emailId, dashboard.getEmail(), true);
        selenium.enterText(password, dashboard.getPassword(), true);
        submitButton.click();
        String CustomerId1 = selenium.getText(CustomerId);
        System.out.println(CustomerId1);
        try {
            continueButton.click();
            System.out.println("Account Created Successfully");
        } catch (Throwable t) {
            System.out.println("Account Already created or not created successfully");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        createNewAccountButton.click();
        selenium.enterText(EnterCustomerId, CustomerId1, true);
//      Select dropdown = new Select(SelectAccountType1);
//      dropdown.selectByValue("Savings");
        selenium.enterText(enterInitialAccount, "10000", true);
        submitButton.click();
        String Accountid1 = selenium.getText(Accountid);
        System.out.println(Accountid1);
        try {
           continueButton.click();
            System.out.println("Account Created Successfully");
        }catch (Throwable a){
            System.out.println("Account Already created or not created successfully");
        }
        DeleteAccountButton1.click();
        selenium.enterText(enterAccountNo,Accountid1,true);
        AccSubmitButton.click();
        driver.switchTo().alert().accept();
    }


}





















//    @FindBy(xpath = "//span[contains(text(),'Close')]")
//    private WebElement ADClose;