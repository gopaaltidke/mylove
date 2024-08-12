package managerDashboardTest;

import base.BaseTest;
import dataFacotory.DashboardPageDataFactory;
import dataobjects.DashboardPageDataObjects;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageobjects.Login.LoginPO;
import pageobjects.managerPO.ManagerPO01;
import utilities.Constants;

import static utilities.Constants.URL;

public class ManagerDashboardTest extends BaseTest {


    @Test (priority = 1)
    public void VerifyManagerId() {
        LoginPO login = new LoginPO(driver);
        ManagerPO01 Dashboard = new ManagerPO01(driver);

        Reporter.log("Step 1: Navigating to the URL");
        selenium.navigateToPage(URL);

        Reporter.log("Step 2: Enter valid login username and Password");
        login.EnterValidCredentials(Constants.UserName, Constants.PassWord);

     //   String aa = Constants.ManagerId;
   //     Assert.assertEquals(,aa ,"Manager Id doesn't match");
   //Assert.assertEquals(Dashboard.VerifyManagerId(),"5454512","Manager Id doesn't match");
    }

    @Test  (priority = 4)
    public void VerifyThatDeleteSubmittedForm() {
        LoginPO login = new LoginPO(driver);
        ManagerPO01 dashboard = new ManagerPO01(driver);

        DashboardPageDataObjects data1 = new DashboardPageDataFactory().getDashboardPageData();
        selenium.navigateToPage(URL);

        login.EnterValidCredentials(Constants.UserName, Constants.PassWord);
        dashboard.VerifyCreateAccountFormAndDeleteAccountForm(data1);
    }

    @Test (priority = 5)
    public void VerifyThatDeleteAccount() {
        LoginPO login = new LoginPO(driver);
        ManagerPO01 dashboard = new ManagerPO01(driver);
        DashboardPageDataObjects data2 = new DashboardPageDataFactory().getDashboardPageData();
        selenium.navigateToPage(URL);
        login.EnterValidCredentials(Constants.UserName, Constants.PassWord);
        dashboard.VerifyCreateAccountAndDeleteAccount(data2);
}
    @Test(priority =3)
    public void VerifyThatCreateNewAccount(){
        LoginPO login = new LoginPO(driver);
        ManagerPO01 dashboard = new ManagerPO01(driver);
        DashboardPageDataObjects data2 = new DashboardPageDataFactory().getDashboardPageData();
        selenium.navigateToPage(URL);
        login.EnterValidCredentials(Constants.UserName, Constants.PassWord);
        dashboard.VerifyThatCreateNewAccountt(data2);
    }
    @Test(priority =2)
    public void VerifyThatCreateNewForm(){
        LoginPO login = new LoginPO(driver);
        ManagerPO01 dashboard = new ManagerPO01(driver);
        DashboardPageDataObjects data2 = new DashboardPageDataFactory().getDashboardPageData();
        selenium.navigateToPage(URL);
        login.EnterValidCredentials(Constants.UserName, Constants.PassWord);
        dashboard.VerifythatCreateNewFormm(data2);
    }





}
