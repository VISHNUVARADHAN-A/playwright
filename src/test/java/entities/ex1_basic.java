package entities;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ex1_basic {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    	private static void log(String message) {
		System.out.println(LocalDateTime.now().format(formatter) + " | " + message);
	}
Playwright playwright;
Browser browser;
Page page;
 @BeforeMethod
 void startup(){
    log("startup");
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        page = browser.newPage();
 }
     @AfterMethod
    void warpup(){
        log("warpup");
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
