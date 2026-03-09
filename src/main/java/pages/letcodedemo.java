package pages;
import com.microsoft.playwright.Page;

public class letcodedemo {
    private final Page page;
    public letcodedemo(Page page) {
        this.page = page;
    }
public void landingpage(){
    page.navigate("https://letcode.in/test");
}
    public void inputspage() {

        page.getByText(" Edit ").click();
        page.getByPlaceholder("Enter first & last name").fill("Bot 1999");
        page.locator("input[value='I am good']").fill(" newly added");
        System.out.println(page.locator("#getMe").inputValue());
        page.locator("#clearMe").clear();
        System.out.println(page.locator("#noEdit").isDisabled());
        System.out.println(page.locator("#dontwrite").isEditable());
    }
public void buttonspage(){
    page.locator("//a[text()=' Click ']").click();
    page.locator("//button[text()='Goto Home']").click();
    page.goBack();
}


}