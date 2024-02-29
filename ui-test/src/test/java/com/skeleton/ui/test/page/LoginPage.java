package com.skeleton.ui.test.page;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.skeleton.ui.core.storage.Storage;
import com.skeleton.ui.core.storage.StorageKey;
import com.skeleton.ui.test.model.LoginModel;

import java.nio.file.Paths;

public class LoginPage {

    Storage storage;
    public LoginPage() {
        this.storage = Storage.getStorage();
    }

    public boolean login(LoginModel loginModel) {
        Page page = storage.getAndCast(StorageKey.PAGE, Page.class);
        page.getByPlaceholder("Username").fill(loginModel.getUsername());
        page.locator("input[id='password']").fill(loginModel.getPassword());
        page.getByRole(AriaRole.BUTTON).click();
        page.screenshot();
        return false;
    }

}
