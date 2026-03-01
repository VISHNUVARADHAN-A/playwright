import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.UsePlaywright;

@UsePlaywright
public class ex1_useplaywrightoprtions {

    @Test
    public void intial(Page page) {
        System.out.println("hello");
        page.navigate("https://www.google.com");
        String title = page.title();
        System.out.println(title);
        Assertions.assertTrue(title.contains("Google"));
    }

}
