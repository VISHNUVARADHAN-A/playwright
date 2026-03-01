package com.emc.entities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ex1_basic {
Playwright playwright;
Browser browser;
Page page;
 @BeforeMethod
 void startup(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        page = browser.newPage();
 }
     @AfterMethod
    void warpup(){
        browser.close();
    }
    @Test
    public void intial(){
        System.out.print("hello");
        page.navigate("https://www.google.com");
        String title = page.title();
        System.out.println(title);
        
    }

}
