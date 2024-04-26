package com.skeleton.ui.test.hook;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.skeleton.ui.core.service.BrowserContextService;
import com.skeleton.ui.core.service.BrowserService;
import com.skeleton.ui.core.service.PageService;
import com.skeleton.ui.core.service.PlaywrightService;
import com.skeleton.ui.core.storage.Storage;
import com.skeleton.ui.core.storage.StorageKey;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.ScenarioScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@ScenarioScope
public class PlaywrightHooks {

    PlaywrightService playwrightService;
    BrowserService browserService;
    BrowserContextService browserContextService;
    PageService pageService;

    Storage storage;

    @Autowired
    public PlaywrightHooks(Storage storage) {
        this.storage = storage;
        this.playwrightService = new PlaywrightService();
        this.browserService = new BrowserService();
        this.browserContextService = new BrowserContextService();
        this.pageService = new PageService();
    }

    @Before(order = -9999)
    public void initPlaywright() {
        Playwright instance = playwrightService.createInstance();
        storage.add(StorageKey.PLAYWRIGHT, instance);
    }

    @Before(order = -8888)
    public void initBrowser() {
        Playwright playwright = storage.getAndCast(StorageKey.PLAYWRIGHT, Playwright.class);
        Browser browser = browserService.createBrowser(playwright);
        storage.add(StorageKey.BROWSER, browser);
    }

    @Before(order = -7777)
    public void initBrowserContext() {
        Browser browser = storage.getAndCast(StorageKey.BROWSER, Browser.class);
        BrowserContext browserContext = browserContextService.createBrowserContext(browser);
        storage.add(StorageKey.BROWSER_CONTEXT, browserContext);
    }
    @Before(order = -6666)
    public void initPage() {
        BrowserContext browserContext = storage.getAndCast(StorageKey.BROWSER_CONTEXT, BrowserContext.class);
        Page page = pageService.createPage(browserContext);
        storage.add(StorageKey.PAGE, page);
    }

    @After(order = 9999)
    public void closePage() {
        Page page = storage.getAndCast(StorageKey.PAGE, Page.class);
        page.close();
    }

    @After(order = 8888)
    public void closeBrowserContext() {
        BrowserContext browserContext = storage.getAndCast(StorageKey.BROWSER_CONTEXT, BrowserContext.class);
        browserContext.close();
    }

    @After(order = 7777)
    public void closeBrowser() {
        Browser browser = storage.getAndCast(StorageKey.BROWSER, Browser.class);
        browser.close();
    }

    @After(order = 6666)
    public void closePlaywright() {
        Playwright playwright = storage.getAndCast(StorageKey.PLAYWRIGHT, Playwright.class);
        playwright.close();
    }

}
