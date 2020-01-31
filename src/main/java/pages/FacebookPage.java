package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FacebookPage extends BasePage {

    private By emailFacebook = By.id("email");
    private By passwordFacebook = By.id("pass");
    private By loginBtn = By.xpath("//input[@data-testid='royal_login_button']");

    public FacebookPage verifyThatRedirectedUrlIsCorrect() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.facebook.com/", url);
        return new FacebookPage();
    }

    public FacebookPage loginWithWrongCredentials(String email, String pass){
        driver.findElement(emailFacebook).sendKeys(email);
        driver.findElement(passwordFacebook).sendKeys(pass);
        return new FacebookPage();
    }

    public AuthorizationPageWithWrongCredentials clickOnLoginBtn(){
        driver.findElement(loginBtn).click();
        return new AuthorizationPageWithWrongCredentials();

    }

    }



