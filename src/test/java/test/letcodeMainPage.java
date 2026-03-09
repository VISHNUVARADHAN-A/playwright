package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class letcodeMainPage extends BaseTest {

    @Test
    @Parameters({"baseurl"})
    void mainPageTest(String baseurl) {
        pages.letcodeMainPage ledtcodemainpage = new pages.letcodeMainPage(page);
        System.out.println(baseurl);
        ledtcodemainpage.goToMainPage(baseurl);
        String gettitle= ledtcodemainpage.getpagetitle();
        Assert.assertEquals(gettitle,"Workspace | LetCode with Koushik");
    }

}