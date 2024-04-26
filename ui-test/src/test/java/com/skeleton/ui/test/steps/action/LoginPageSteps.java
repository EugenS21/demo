package com.skeleton.ui.test.steps.action;

import com.microsoft.playwright.Page;
import com.skeleton.ui.core.storage.Storage;
import com.skeleton.ui.core.storage.StorageKey;
import com.skeleton.ui.test.model.LoginModel;
import com.skeleton.ui.test.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginPageSteps {

    LoginPage loginPage;
    Storage storage;

    @Autowired
    public LoginPageSteps(LoginPage loginPage, Storage storage) {
        this.storage = storage;
        this.loginPage = loginPage;
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        Page page = storage.getAndCast(StorageKey.PAGE, Page.class);
        page.navigate("");
    }

    @When("user is trying to login with the following credentials:")
    public void userIsTryingToLoginWithTheFollowingCredentials(LoginModel loginModel) {
        loginPage.login(loginModel);
    }

}
