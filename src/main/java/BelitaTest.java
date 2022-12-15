import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BelitaTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\University\\qa\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://belita-shop.by/");
        WebElement searchIcon = driver.findElement(By.xpath("//div[@class='b-page']/div/div/div/div/div/div/div/form/fieldset/button[@class='submit']"));
        WebElement searchInputElement = driver.findElement(By.xpath("//div[@class='b-page']/div/div/div/div/div/div/div/form/fieldset/input[@class='form-control']"));
        searchInputElement.sendKeys("шампунь");
        searchIcon.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
