package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SharedDriver {

    private static WebDriver webDriver;

    public enum Browser {
        CHROME,
        FIREFOX,
        EDGE,
        OPERA
    }

    protected static WebDriver getWebDriver(Browser browser) {

        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;

            case FIREFOX:
                WebDriverManager.chromedriver().setup();
                webDriver = new FirefoxDriver();
                break;

            case EDGE:
                WebDriverManager.edgedriver().setup();
                webDriver = new EdgeDriver();
                break;

            case OPERA:
                WebDriverManager.operadriver().setup();
                webDriver = new OperaDriver();
                break;
        }

        webDriver.manage().window().maximize();
        //webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return webDriver;
    }

    protected static void closeDriver() {
        if (webDriver != null) {
            webDriver.close();
        }
    }


}
