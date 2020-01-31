package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GooglePage extends BasePage{
    private By searchField = By.name("q");

    public SearchingPage enterFacebookTextInSearchField(String text) {
        driver.findElement(searchField).sendKeys(text + Keys.ENTER);
        return new SearchingPage();

    }
}
