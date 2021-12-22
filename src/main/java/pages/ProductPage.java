package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class ProductPage extends CommonPage {

    String userEmail = new Random().nextInt(1000) + "test@gmail.com";
    String userPassword = new Random().nextInt(1000) + "a1*";
    String name = new Random().toString();
    int phone = new Random().nextInt(1000) + 999;

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

    @FindBy(partialLinkText = "Regist")
    private WebElement register;

    @FindBy(name = "firstname")
    private WebElement firstname;

    @FindBy(name = "lastname")
    private WebElement lastname;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(id = "input-telephone")
    private WebElement inputTelephone;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirm")
    private WebElement confirmPassword;

    @FindBy(id = "agree")
    private WebElement agree;

//    @FindBy(cssSelector = "input[type='submit']")
//    private WebElement submit;


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
    }

    public void submitLogin() {
        inputPassword.submit();
        inputPassword.clear();
        inputEmail.clear();
    }

    public String getTextFromLoginErrorMessage() {
        String text = accountLoginText.getText();
        return text;
    }

    public void clickRegister() {
        register.click();
    }

    public void enterFirstName() {
        firstname.click();
        firstname.sendKeys("ruta");
    }

    public void enterLastName() {
        lastname.sendKeys(name);
    }

    public void enterEmail() {
        email.sendKeys(userEmail);
    }

    public void enterTelephone() {
        inputTelephone.sendKeys();
    }

    public void enterPassword() {
        password.sendKeys(userPassword);
    }

    public void enterPasswordConfirm() {
        confirmPassword.sendKeys(userPassword);
    }

    public void agreeWithPrivacyPolicy() {
        agree.click();
    }

    public void submitRegistrationForm() {

    }

}

