package exercises;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.ProductPage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Random;

public class ExerciseOne extends BaseTest {

    private CommonPage commonPage;
    private ProductPage productPage;



    @Test
    public void test() {

        commonPage = new CommonPage(driver);
        productPage = new ProductPage(driver);

        commonPage.clickWishListTotal();
        productPage.clickMyAccount();


        productPage.clickLogin();
        productPage.sendEmail();
        productPage.sendPassword();
        productPage.submitLogin();

        String expectedLoginErrorMessage = "No match for E-Mail Address";
        String actualLoginErrorMessage = productPage.getTextFromLoginErrorMessage();
        assertTrue(actualLoginErrorMessage.contains(expectedLoginErrorMessage), "The login error message is not correct");

        int actualSize = driver.findElements(By.name("search")).size();
        System.out.println("Number of search boxes: " + actualSize);

        productPage.clickMyAccount();
        productPage.clickRegister();

        productPage.enterFirstName();
        productPage.enterLastName();
        productPage.enterEmail();
        productPage.enterTelephone();
        productPage.enterPassword();
        productPage.enterPasswordConfirm();

        driver.findElement(By.cssSelector("input[type='submit']")).click();


    }
}
