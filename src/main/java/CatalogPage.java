import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends Page {
    protected CatalogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "buy-btn-wrap")
    WebElement addToCartIcon;

    public CatalogPage addToCart() {
        waitForVisibilityOfElement(driver, addToCartIcon);
        addToCartIcon.click();
        return this;
    }
}
