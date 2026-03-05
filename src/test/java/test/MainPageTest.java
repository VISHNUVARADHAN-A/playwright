package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTest extends BaseTest {

    @Test
    public void mainPageTest() {
        MainPage mainPage = new MainPage(page);
        mainPage.goToMainPage();
        mainPage.getpagetitle();
    }

}