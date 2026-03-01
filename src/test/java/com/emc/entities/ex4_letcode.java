package com.emc.entities;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class ex4_letcode {
    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext browserContext;

    Page page;
   @BeforeAll
    public static void setUpBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                .setChannel("msedge")
                        .setHeadless(false)
                        .setArgs(Arrays.asList("--no-sandbox","--disable-extensions","--disable-gpu"))
        );
        browserContext = browser.newContext();
    }

    @BeforeEach
    public void setUp() {
        page = browserContext.newPage();
    }

    @AfterAll
    public static void tearDown() {
        browser.close();
        playwright.close();
    }

@Test
public void letcodedemo(){
page.navigate("https://letcode.in/test");
page.locator("a[href='/home']").click();
System.out.println(page.title());
System.out.println(page.getByText("Fjallraven - Foldsack No. 1 Ba...").textContent());
System.out.println(page.locator("//section/div/div[2]/div[3]").textContent());
for (int i=1; i<5; i++){
    System.out.println(page.locator("//section/div/div[2]/div["+i+"]").textContent());
    
}
}
}
