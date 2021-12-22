package exercises;

import basetest.BaseTest;
import com.thoughtworks.xstream.XStream;
import models.ShopItem;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.ProductPage;
import pages.SearchPage;

import java.io.File;
import java.io.IOException;
import static org.testng.Assert.assertEquals;

public class ShopItemTest extends BaseTest {

    private ShopItem item;
    private CommonPage commonPage;
    private ProductPage productPage;
    private SearchPage searchPage;

    @Test
    public void testShopItems() throws IOException {

        commonPage = new CommonPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);


        XStream xstream = new XStream();

        item = new ShopItem();
        item.setName("Palm Treo Pro");
        item.setPrice("$337.99");
        item.setBrand("Palm");
        item.setProductCode("Product 2");

        FileUtils.writeStringToFile(new File("src/test/resources/Palm.xml"), xstream.toXML(item));

        ShopItem palmTreoPro = (ShopItem) xstream.fromXML(FileUtils.readFileToString(new File("src/test/resources/Palm.xml")));

        searchPage.searchPalm();
        searchPage.clickSearch();

        driver.findElement(By.id("content")).click();

        assertEquals(driver.findElement(By.cssSelector("#content > div > div.col-sm-4 > h1")).getText() , palmTreoPro.getName(), "The name is not correct");


    }

}
