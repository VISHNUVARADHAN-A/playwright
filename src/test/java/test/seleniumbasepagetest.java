package test;

import base.BaseTest1;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.letcodeMainPage;
import pages.seleniumbase;

public class seleniumbasepagetest extends BaseTest1 {
    @Test
    void mainpage() {
        seleniumbase sb = new seleniumbase(getPage());
        sb.seleniumbaserunner();
    }


}
