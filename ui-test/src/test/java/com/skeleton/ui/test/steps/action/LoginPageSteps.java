package com.skeleton.ui.test.steps.action;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.skeleton.ui.core.storage.Storage;
import com.skeleton.ui.core.storage.StorageKey;
import com.skeleton.ui.test.model.LoginModel;
import com.skeleton.ui.test.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    LoginPage loginPage;
    Storage storage;
    public LoginPageSteps() {
        this.storage = Storage.getStorage();
        this.loginPage = new LoginPage();
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
