package pages;
import com.microsoft.playwright.Page;

public class letcodeMainPage {
    private final Page page;
    //private static final  String BASE_URL = "https://letcode.in/test";

    public letcodeMainPage(Page page) {
        this.page = page;
    }
    public void goToMainPage(String BASE_URL) {
        page.navigate(BASE_URL);
    }
    public String getpagetitle(){
        System.out.println(page.title());
        return page.title();
    }

}