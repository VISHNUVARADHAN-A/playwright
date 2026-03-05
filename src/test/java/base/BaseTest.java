package base;

import org.testng.annotations.*;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest {
    protected static Playwright playwright;
    protected static Browser browser;
    protected Page page; // Each test class gets its own page

    @BeforeSuite
    public void startup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );
    }

    @BeforeMethod
    public void createContext() {
        page = browser.newPage();
    }

    @AfterMethod
    public void closeContext() {
        if (page != null) page.close();
    }

    @AfterSuite
    public void warpup() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
