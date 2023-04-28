package testNg;

import ca.assistlist.core.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void beforeAll() {
        driver = WebDriverFactory.getDriver();
    }

    @AfterSuite
    public void afterAll() {
        driver.quit();
    }
}
