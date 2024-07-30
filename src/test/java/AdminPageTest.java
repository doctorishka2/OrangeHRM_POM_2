import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utils.UseCaseBase;

public class AdminPageTest extends UseCaseBase {

    private static AdminPage adminPage = new AdminPage();
    private static LoginPage loginPage = new LoginPage();
    private static HomePage homePage = new HomePage();

    @BeforeAll
    public static void classSetup() throws InterruptedException {
        loginPage.loginToOrangeHRM();
    }

    @BeforeEach
    public void setAdminPage() {
      homePage.clickOnAdminTab();
    }




    @Test
    public void fillAdminForm() throws InterruptedException {
        adminPage.isAdminLogoVisible();
        adminPage.closeLeftNavPanel();
        adminPage.fillUsernameField();
        adminPage.selectUserRole();

    }




}
