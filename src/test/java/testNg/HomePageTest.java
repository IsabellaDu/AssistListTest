package testNg;

import ca.assistlist.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void openHomePage() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
    }
}
