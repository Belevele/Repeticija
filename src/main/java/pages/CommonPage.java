package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage extends AbstractObjectPage {

    @FindBy(id = "wishlist-total")
    private WebElement wishlistTotal;

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    public void clickWishListTotal() {
        wishlistTotal.click();
    }
}
