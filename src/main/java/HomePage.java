import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page{

    private static final String HOMEPAGE_URL = "https://belita-shop.by/";

    HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openPage(){
        driver.get(HOMEPAGE_URL);
        return this;
    }

    @FindBy(xpath ="//div[@class='b-page']/div/div/div/div/div/div/div/form/fieldset/button[@class='submit']" )
    WebElement searchIcon;

    @FindBy(xpath ="//div[@class='b-page']/div/div/div/div/div/div/div/form/fieldset/input[@class='form-control']" )
    WebElement searchInputElement;

    public HomePage enterSearch(String searchText) {
        waitForVisibilityOfElement(driver, searchInputElement);
        searchInputElement.sendKeys(searchText);
        return this;
    }

    public HomePage clickSearchIcon() {
        waitForVisibilityOfElement(driver, searchIcon);
        searchIcon.click();
        return this;
    }
}
