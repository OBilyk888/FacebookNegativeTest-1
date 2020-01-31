package pages;

import core.DriverManager;
import org.openqa.selenium.By;

public class SearchingPage extends BasePage {

    private By searchBtn = By.xpath("//a[@href='https://www.facebook.com/']");

    public FacebookPage clickOnSearchBtn(){
        driver.findElement(searchBtn).click();
        return new FacebookPage();

    }

}
