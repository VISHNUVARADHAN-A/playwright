package com.emc.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class mainmethodexc {

 private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    private static void log(String message) {
        System.out.println(LocalDateTime.now().format(formatter) + " | " + message);
    }

    public static void main(String[] args) {

        log("Program started");

        try (Playwright playwright = Playwright.create()) {

            log("Playwright created");

            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setHeadless(false) // change to true for faster start
            );

            log("Browser launched");

            BrowserContext context = browser.newContext();
            log("Context created");

            Page page = context.newPage();
            log("Page created");

            page.navigate("https://example.com");
            log("Navigation completed");

            page.waitForTimeout(5000);

            browser.close();
            log("Browser closed");
        }

        log("Program completed");
    }
} 