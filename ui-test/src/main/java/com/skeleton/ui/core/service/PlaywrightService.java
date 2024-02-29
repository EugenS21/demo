package com.skeleton.ui.core.service;

import com.microsoft.playwright.Playwright;

public class PlaywrightService {

    public Playwright createInstance() {
        return Playwright.create();
    }

}
