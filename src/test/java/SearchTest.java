import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\University\\qa\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver)
                .openPage();
    }

    @Test(description = "Search items")
    public void searchItems() throws InterruptedException {
        homePage.enterSearch("гель для душа").clickSearchIcon();
    }
}
