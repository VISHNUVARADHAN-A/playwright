package test;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.letcodeMainPage;

public class letcodeMainPageTest extends BaseTest {

    @Test
    @Parameters({"baseurl"})
    void mainPageTest(String baseurl) {
        letcodeMainPage ledtcodemainpage = new letcodeMainPage(page);
        System.out.println(baseurl);
        ledtcodemainpage.goToMainPage(baseurl);
        String gettitle= ledtcodemainpage.getpagetitle();
        Assert.assertEquals(gettitle,"Workspace | LetCode with Koushik");
    }

}