package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AuthorizationPageWithWrongCredentials extends BasePage {
    private By alert = By.xpath("//div[@role='alert']");

    public AuthorizationPageWithWrongCredentials verifyThatAlertIsCorrect() {
        String alertText = driver.findElement(alert).getText();
        /*String expectedAlertTextUKR = "Ви ввели неправильний пароль. Забули пароль?";*/
        String expectedAlertTextUKR = "The email or phone number you’ve entered doesn’t match any account. Sign up for an account.";

        Assert.assertTrue(alertText.contains(expectedAlertTextUKR));
        return new AuthorizationPageWithWrongCredentials();

    }
}
