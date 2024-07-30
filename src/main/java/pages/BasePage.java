package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    protected void clickElementByXpath(String xpath) {
        findElementByXpath(xpath).click();
    }

    protected void sendTextToElementByXpath(String xpath, String text) {
        findElementByXpath(xpath).sendKeys(text);
    }

    protected void selectValueByIndex(String xpath, int number) {
        Select value = new Select(findElementByXpath(xpath));
        value.selectByIndex(number);
    }

    protected void selectValueByValue(String xpath, String text) {
        Select value = new Select(findElementByXpath(xpath));
        value.deselectByValue(text);
    }

    protected void selectValueByText(String xpath, String text) {
        Select value = new Select(findElementByXpath(xpath));
        value.selectByVisibleText(text);
    }

    protected boolean elementExists(String xpath) {
        try {
            findElementByXpath(xpath);  ////////////////////////////////////////////////////
            return true;
        }
        catch (Exception err) {
            return false;
        }
    }

    public WebElement findElementByXpath(String xpath) {
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = webDriver.findElement(By.xpath(xpath));
        return element;
    }

    protected String getCurrentPageUrl() {
        return webDriver.getCurrentUrl();
    }




}
