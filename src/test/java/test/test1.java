package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class test1 {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    private static void log(String message) {
        System.out.println(LocalDateTime.now().format(formatter) + " | " + message);
    }

    Playwright playwright;
    Browser browser;
    Page page;

    @BeforeSuite
    void beforesuitstart(){
        log("beforesuitstart");
    }
    @AfterSuite
    void aftersuitend(){
        log("aftersuitend");
    }

@BeforeClass
void BeforeClass(){
    log("before class");
}
@AfterClass
void AfterClass(){
    log("After class");
}
    @BeforeMethod
    void startup() {
        log("startup");
        playwright = Playwright.create();
        browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @Test(priority = 0)
   public void priorityRunner() {
        log("start up0");
        page.navigate("https://letcode.in/test");
    }

    @Test(priority = 1)
    void runner() {
        log("start up1");
        page.navigate("https://seleniumbase.io/demo_page");
    }

    @AfterMethod
    void enddown() {
        log("wrapup");
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
}
