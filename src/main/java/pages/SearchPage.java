package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractObjectPage {

//    @FindBy(name = "search")
//    private WebElement searchField;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

//    public void getSizeOfSearchBox() {
//        System.out.println("Number of search boxes is: " + searchField.size());
//    }
}
