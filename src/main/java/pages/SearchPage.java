package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractObjectPage {

    @FindBy(name = "search")
    private WebElement searchField;

    @FindBy(id = "search")
    private WebElement buttonSearch;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchPalm() {
        searchField.sendKeys("Palm");
    }

    public void clickSearch() {
        buttonSearch.click();
    }

//    public void getSizeOfSearchBox() {
//        System.out.println("Number of search boxes is: " + searchField.size());
//    }
}
