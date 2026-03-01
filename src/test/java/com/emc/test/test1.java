package com.emc.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class test1 {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    private static void log(String message) {
        System.out.println(LocalDateTime.now().format(formatter) + " | " + message);
    }

    Playwright playwright;
    Browser browser;
    Page page;

    @BeforeMethod
    void startup() {
        playwright = Playwright.create();
        browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @Test(priority = 0)
    void priorityRunner() {
        page.navigate("https://letcode.in/test");
    }

    @Test
    void runner() {
        log("start up");
        page.navigate("https://www.google.com");
    }

    @AfterMethod
    void tearup() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
}
