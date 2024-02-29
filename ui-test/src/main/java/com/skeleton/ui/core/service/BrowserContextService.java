package com.skeleton.ui.core.service;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;

import java.nio.file.Paths;
import java.util.List;

public class BrowserContextService {

    public BrowserContext createBrowserContext(Browser browser) {
        Browser.NewContextOptions contextOptions = new Browser.NewContextOptions();
        contextOptions.setScreenSize(1920, 1600);
        contextOptions.setBaseURL("https://www.saucedemo.com/");
        contextOptions.setPermissions(List.of("geolocation"));
        contextOptions.setRecordVideoDir(Paths.get("/home/eugeniu-savca/.idea-projects/demo/ui-test/target/recordings"));
        contextOptions.setRecordVideoSize(1920,1600);
        return browser.newContext(contextOptions);
    }

}
