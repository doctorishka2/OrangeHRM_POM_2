package pages;

import consts.Consts;

import static org.junit.jupiter.api.Assertions.*;

public class LoginPage extends BasePage {

    private static final String LOGO_IMG = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img";
    private static final String USERNAME_FIELD = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input";
    private static final String PASSWORD_FIELD = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
    private static final String LOGIN_BUTTON = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";
    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "admin123";
    public static final String HOMEPAGELOGO = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img";


    public void navigateToLoginPage() {
        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }

    public void insertUsenName() {
        findElementByXpath(USERNAME_FIELD).sendKeys(USERNAME);
    }

    public void insertPassword() {
        findElementByXpath(PASSWORD_FIELD).sendKeys(PASSWORD);
    }

    public void cliskOnLoginButton() {
        findElementByXpath(LOGIN_BUTTON).click();
    }

    public boolean isHomePageLogoVisible() {
        Boolean isVisible = elementExists(HOMEPAGELOGO);
        return isVisible;
    }

    //create login method to return home page
    public void loginToOrangeHRM() throws InterruptedException {
        webDriver.get(Consts.MAIN_URL);
        isLogoVisible();
        insertUsenName();
        insertPassword();
        cliskOnLoginButton();
        isHomePageLogoVisible();
        Thread.sleep(1000);
    }


}
