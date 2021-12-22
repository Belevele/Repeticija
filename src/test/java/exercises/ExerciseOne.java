package exercises;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.ProductPage;

public class ExerciseOne extends BaseTest {

    private CommonPage commonPage;
    private ProductPage productPage;

    @Test
    public void test() {

        commonPage = new CommonPage(driver);
        productPage = new ProductPage(driver);

        commonPage.clickWishListTotal();
    }
}
