package pages;

import core.DriverManager;

    public class MainPage extends BasePage{

        public GooglePage navigateToGooglePage (String url){
            driver.get(url);
            return new GooglePage();
        }
    }
