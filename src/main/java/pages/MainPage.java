package pages;
import com.microsoft.playwright.Page;
public class MainPage {
    private final Page page;
    private static final  String BASE_URL = "https://letcode.in/test";

    public MainPage(Page page) {
        this.page = page;
    }
    public void goToMainPage() {
        page.navigate(BASE_URL);
    }
    public void getpagetitle(){
        System.out.println(page.title());
    }
}