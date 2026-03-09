package pages;
import com.microsoft.playwright.Page;

public class seleniumbase {
    private final Page page;
    public seleniumbase(Page page){
        this.page =page;
    }
    public void seleniumbaserunner(){
        page.navigate("https://seleniumbase.io/demo_page");

    }

}
