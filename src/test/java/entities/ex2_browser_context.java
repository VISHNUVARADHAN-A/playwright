package entities;
// package com.emc.entities;
// import java.util.Arrays;

// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeMethod;

// import com.microsoft.playwright.Browser;
// import com.microsoft.playwright.BrowserContext;
// import com.microsoft.playwright.BrowserType;
// import com.microsoft.playwright.Page;
// import com.microsoft.playwright.Playwright;
// // Use @TestInstance(TestInstance.Lifecycle.PER_CLASS) to use non-static @BeforeAll
// public class ex2_browser_context {
//      private static Playwright playwright;
//     private static Browser browser;
//     private static BrowserContext browserContext;

//     Page page;

//     @BeforeMethod
//     public static void setUpBrowser() {
//         playwright = Playwright.create();
//         browser = playwright.chromium().launch(
//                 new BrowserType.LaunchOptions()
//                 .setChannel("msedge")
//                         .setHeadless(false)
//                         .setArgs(Arrays.asList("--no-sandbox","--disable-extensions","--disable-gpu"))
//         );
//         browserContext = browser.newContext();
//     }

//     @BeforeMethod
//     public void setUp() {
//         page = browserContext.newPage();
//     }

//     @AfterMethod
//     public static void tearDown() {
//         browser.close();
//         playwright.close();
//     }

//     @Test
//     void shouldShowThePageTitle() {
//         page.navigate("https://practicesoftwaretesting.com");
//         String title = page.title();
//         Assertions.assertTrue(title.contains("Practice Software Testing"));
//     }

//     @Test
//     void shouldShowSearchTermsInTheTitle() {
//         page.navigate("https://practicesoftwaretesting.com");
//         System.out.println("NODE PATH: " + System.getenv("PLAYWRIGHT_NODEJS_PATH"));
//         System.out.println("Skip Download active: " + System.getenv("PLAYWRIGHT_SKIP_BROWSER_DOWNLOAD"));
//         page.locator("[placeholder=Search]").fill("Pliers");
//         page.locator("button:has-text('Search')").click();

//         int matchingProductCount = page.locator(".card-title").count();

//         Assertions.assertTrue(matchingProductCount > 0);
//     }
// }