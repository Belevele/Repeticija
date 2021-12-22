package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class ProductPage extends CommonPage {

    String userEmail = new Random().nextInt(1000) + "test@gmail.com";
    String userPassword = new Random().nextInt(1000) + "a1*";

    @FindBy(linkText = "My Account")
    private WebElement myAccount;

    @FindBy(linkText = "Login")
    private WebElement login;

    @FindBy(id = "input-email")
    private WebElement inputEmail;

    @FindBy(id = "input-password")
    private WebElement inputPassword;

    @FindBy(id = "account-login")
    private WebElement accountLoginText;

//    @FindBy(linkText= "Continue")
//    private WebElement

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccount() {
        myAccount.click();
        }

    public void clickLogin() {
        login.click();
    }

    public void sendEmail() {
        inputEmail.sendKeys(userEmail);
    }

    public void sendPassword() {
        inputPassword.sendKeys(userPassword);
        inputPassword.submit();
    }

    public String getTextFromLoginErrorMessage() {
        String text = accountLoginText.getText();
        return text;
    }

    }

