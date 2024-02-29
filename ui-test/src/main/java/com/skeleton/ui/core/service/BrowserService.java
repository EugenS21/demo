package com.skeleton.ui.core.service;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class BrowserService {

    public Browser createBrowser(Playwright playwright) {
        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions();
        launchOptions.setChannel("msedge");
        launchOptions.setHeadless(false);
        launchOptions.setTimeout(40000);
        return playwright.chromium().launch(launchOptions);
    }

}
