package ca.assistlist.pages;

import ca.assistlist.utils.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ca.assistlist.utils.WaitUtils.waitUntilElementIsVisible;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class='ui container']//h1[contains(text(),'Together, we can make a difference')]")
    private WebElement elPageTitle;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {
        super.driver.get(ConfigProvider.getBASE_URL());
        ensureOpened();
    }

    @Override
    public void ensureOpened() {
        waitUntilElementIsVisible(super.driver, elPageTitle);
    }
}
