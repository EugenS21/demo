package com.skeleton.ui.test.steps.validation;

import com.microsoft.playwright.Page;
import com.skeleton.ui.core.storage.Storage;
import com.skeleton.ui.core.storage.StorageKey;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class LoginPageSteps {

    @Autowired
    Storage storage;

    @Then("user is redirected to home page")
    public void userIsRedirectedToHomePage() {
        Page page = storage.getAndCast(StorageKey.PAGE, Page.class);
        Assertions.assertThat(page.url()).contains("inventory");
    }

}
