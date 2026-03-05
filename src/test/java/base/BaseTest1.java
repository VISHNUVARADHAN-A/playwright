package base;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest1 {
    public static ThreadLocal<Playwright> playwright = new ThreadLocal<>();
    public static ThreadLocal<Browser> browser = new ThreadLocal<>();
    public static ThreadLocal<Page> page = new ThreadLocal<>();

    @BeforeMethod
    public void setup() {
        playwright.set(Playwright.create());
        browser.set(playwright.get().chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        ));
        BrowserContext context = browser.get().newContext();
        page.set(context.newPage());
    }

    @AfterMethod
    public void teardown() {
        page.get().close();
        browser.get().close();
        playwright.get().close();

    }

    public Page getPage() {
        return page.get();
    }
}
