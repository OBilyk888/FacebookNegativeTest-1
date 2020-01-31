import com.sun.org.apache.xerces.internal.parsers.BasicParserConfiguration;
import io.cucumber.java.Before;
import org.testng.annotations.Test;
import pages.MainPage;

public class NegativeTest {

    @Test
    public void negativeTest(){

        new MainPage()
                .navigateToGooglePage("https://www.google.com")
                .enterFacebookTextInSearchField("Facebook")
                .clickOnSearchBtn()
                .verifyThatRedirectedUrlIsCorrect()
                .loginWithWrongCredentials("badlogin","badPassword")
                .clickOnLoginBtn()
                .verifyThatAlertIsCorrect();
    }
}
