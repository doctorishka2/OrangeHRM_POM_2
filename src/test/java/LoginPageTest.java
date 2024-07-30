import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.SharedDriver;
import utils.UseCaseBase;

import static org.junit.jupiter.api.Assertions.*;

public class LoginPageTest extends UseCaseBase {

    private static LoginPage loginPage;
    private static HomePage homePage;

    @BeforeAll
    public static void classSetup() {
        loginPage = new LoginPage();
    }

    @BeforeEach
    public void beforeTest() {
        loginPage.navigateToLoginPage();
    }

    @Test
    public void loginPageLoadTest() {
        Boolean success = loginPage.isLogoVisible();
        assertTrue(success);
    }

    @Test
    public void loginToOrangeHRM() throws InterruptedException {
        loginPage.loginToOrangeHRM();
        Thread.sleep(2000);
    }

//    @Test
//    public void clockOnAdminTab() throws InterruptedException {
//        loginToOrangeHRM();
//        loginPage.isHomePageLogoVisible();
//
//    }


}
