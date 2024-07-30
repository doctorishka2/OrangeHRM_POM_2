package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminPage extends BasePage {

    private static HomePage homePage = new HomePage();


    private static final String ADMIN_USERNAME_FIELD = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input";
    private static final String USER_ROLE_FIELD = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]";
    private static final String USER_ROLE_DDL = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]";
    private static final String EMPLOYEE_NAME_FIELD = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input"; ////////////////////
    private static final String LEFT_NAV_PANEL_BTN = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button/i";


    public boolean isAdminLogoVisible() {
        Boolean isVisible = elementExists(homePage.ADMIN_TAB);
        return isVisible;
    }

    public void fillUsernameField() {
        findElementByXpath(ADMIN_USERNAME_FIELD).sendKeys("Pavel");
    }

    public void closeLeftNavPanel() {
        findElementByXpath(LEFT_NAV_PANEL_BTN).click();
    }

    public void selectUserRole() throws InterruptedException {
        //findElementByXpath(USER_ROLE_FIELD).click();
        Thread.sleep(2000);
        selectValueByText(USER_ROLE_DDL, "Admin");
        Thread.sleep(2000);
    }



}
