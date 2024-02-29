package com.skeleton.ui.test.steps.action;

import com.skeleton.ui.test.model.LoginModel;
import com.skeleton.ui.test.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {

    }

    @When("user is trying to login with the following credentials:")
    public void userIsTryingToLoginWithTheFollowingCredentials(LoginModel loginModel) {
//        Datatable as datatable
//        List<Map<String, String>> maps = dataTable.asMaps();
//        String username = maps.get(0).get("username");
//        String pwd = maps.get(1).get("password");
//        Datatable as map
//        String username = data.get("username");
//        String pwd = data.get("password");
//        loginPage.login(pwd, username);
        boolean login = loginPage.login(loginModel);

    }

}
