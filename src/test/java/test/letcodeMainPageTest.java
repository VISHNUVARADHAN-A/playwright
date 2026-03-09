package test;

import base.BaseTest;

import base.BaseTest1;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.letcodedemo;
import pages.seleniumbase;

public class letcodeMainPageTest extends BaseTest1 {

    @Test
    void inputspage() {
        letcodedemo lc = new letcodedemo(getPage());
        lc.landingpage();
        lc.inputspage();
    }
    @Test
    void buttonspage() {
        letcodedemo lc = new letcodedemo(getPage());
        lc.landingpage();
        lc.buttonspage();
    }



}