package com.skeleton.ui.test.steps.validation;

import com.microsoft.playwright.Page;
import com.skeleton.ui.core.storage.Storage;
import com.skeleton.ui.core.storage.StorageKey;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

public class LoginPageSteps {
    Storage storage;
    public LoginPageSteps() {
        this.storage = Storage.getStorage();
    }
    @Then("user is redirected to home page")
    public void userIsRedirectedToHomePage() {
        Page page = storage.getAndCast(StorageKey.PAGE, Page.class);
        Assertions.assertThat(page.url()).contains("inventory");
    }

}
