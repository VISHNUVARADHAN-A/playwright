package com.emc.entities;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;
import com.microsoft.playwright.junit.UsePlaywright;

@UsePlaywright(ex3_demo.Myoptions.class)
public class ex3_demo {
 public static class Myoptions implements OptionsFactory{
 @Override
 public Options getOptions(){
    return new Options()
    .setHeadless(false)
    .setLaunchOptions(
        new BrowserType.LaunchOptions()
        .setArgs(Arrays.asList("--no-sandbox","--disable-gpu"))
    );
 }
 }
    @Test
    public void letsrun(Page page){
        page.navigate("https://www.google.com");
    }
}
