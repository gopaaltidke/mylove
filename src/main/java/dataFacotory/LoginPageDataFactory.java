package dataFacotory;

import dataobjects.LoginPageDataObjects;

public class LoginPageDataFactory {

    public LoginPageDataObjects getLoginPageData() {

        LoginPageDataObjects data = new LoginPageDataObjects();
        data.setInvalidUserName("54584");
        data.setInvalidPassword("4545@gaa");
        return data;

    }
}
