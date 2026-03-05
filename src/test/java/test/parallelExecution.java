package test;

import base.BaseTest;
import base.BaseTest1;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pages.letcodeMainPage;

public class parallelExecution extends BaseTest1 {
    @Test
    void mainPageTest() {
        String baseurl="https://letcode.in/test";
        letcodeMainPage ledtcodemainpage = new letcodeMainPage(getPage());
        ledtcodemainpage.goToMainPage(baseurl);
        String gettitle= ledtcodemainpage.getpagetitle();
        Assert.assertEquals(gettitle,"Workspace | LetCode with Koushik");
    }
    @Test
    void mainPageTest1() {
        String baseurl="https://seleniumbase.io/demo_page";
        letcodeMainPage ledtcodemainpage = new letcodeMainPage(getPage());
        System.out.println(baseurl);
        ledtcodemainpage.goToMainPage(baseurl);
        String gettitle= ledtcodemainpage.getpagetitle();
        Assert.assertEquals(gettitle,"Web Testing Page");
    }

}