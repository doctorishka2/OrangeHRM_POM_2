package pages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BasePage {



    public static final String HOMEPAGELOGO = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img";
    public static final String ADMIN_TAB = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span";
    public static final String PIM_TAB = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span";
    public static final String LEAVE_TAB = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span";
    public static final String TIME_TAB = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span";
    public static final String RECRUITMENT_TAB = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span";


    

    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(HOMEPAGELOGO);
        return isVisible;
    }

    public void clickOnAdminTab() {
        findElementByXpath(ADMIN_TAB).click();

    }

    public boolean isAdminLogoVisible() {
        Boolean isVisible = elementExists(ADMIN_TAB);
        return isVisible;
    }

}
