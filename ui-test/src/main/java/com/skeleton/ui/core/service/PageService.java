package com.skeleton.ui.core.service;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

public class PageService {

    public Page createPage(BrowserContext context) {
        return context.newPage();
    }

}
