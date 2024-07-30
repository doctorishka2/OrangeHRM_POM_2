import consts.Consts;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;


import utils.UseCaseBase;
import utils.SharedDriver;


public class HomePageTest extends UseCaseBase {

    private static HomePage homePage = new HomePage();
    private static LoginPage loginPage = new LoginPage();

    @BeforeAll
    public static void classSetup() throws InterruptedException {
        loginPage.loginToOrangeHRM();
    }

    @Test
    public void testing() throws InterruptedException {
        loginPage.isLogoVisible();
    }

    @Test
    public void goToAdminPage() throws InterruptedException {
        homePage.clickOnAdminTab();
        homePage.isAdminLogoVisible();
    }


}
