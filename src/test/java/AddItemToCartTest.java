import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest {
    private WebDriver driver;
    private AuthPage authPage;
    private HomePage homePage;
    private CatalogPage catalogPage;

    private String email = "Valerie143@mail.ru";
    private String pass = "v1542139";

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\University\\qa\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        authPage = new AuthPage(driver)
                .openPage();
        catalogPage = new CatalogPage(driver);
    }

    @Test(description = "Add item to cart")
    public void addItem() throws InterruptedException {
        authPage.enterEmail(email)
                .enterPassword(pass)
                .signIn();
        homePage = new HomePage(driver)
                .openPage();
        homePage.enterSearch("гель для душа").clickSearchIcon();
        catalogPage.addToCart();
    }
}
