package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        int randomNumber = (int) (Math.random() * 1000);
        String email = "juniorTest" + randomNumber + "@gmail.com";

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .registerUserValidData(email, "juniortest@gmail.com")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void registerUserWithSameEmailTest() {
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .registerUserInvalidData("juniortest@gmail.com", "juniortest@gmail.com")
                .getError();

        Assert.assertTrue(error.getText().contains("An account is already registered with your email address"));

    }
}
