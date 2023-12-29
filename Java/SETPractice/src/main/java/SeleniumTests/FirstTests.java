package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class FirstTests {

    WebDriver driver;

    @BeforeMethod
    void SetUp() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    void logoTest() {
        By logo = By.cssSelector(".orangehrm-login-branding img");
        Assert.assertEquals(WaitAndFindElement(logo, 20).isDisplayed(), true);
    }

    @Test
    void loginTest() {
        By userName = By.name("username");
        By password = By.name("password");
        By loginButton = By.xpath("//button[@type='submit']");
        By logo = By.cssSelector(".oxd-brand-banner img");

        WaitAndFindElement(userName, 20)
                .sendKeys("Admin");
        WaitAndFindElement(password, 20)
                .sendKeys("admin123");
        WaitAndFindElement(loginButton, 20)
                .click();

        Assert.assertEquals(WaitAndFindElement(logo, 20).isDisplayed(), true);
    }

    @AfterMethod
    void TearDown() {
        driver.quit();
    }

    WebElement WaitAndFindElement(By locator, int timeOutInSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds))
                .until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator);
    }
}
