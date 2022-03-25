package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {

        int randomNumber = (int)(Math.random()*1000);
        String email = "juniorTest" + randomNumber + "@gmail.com";

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .registerUser(email, "juniortest@gmail.com" )
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }
}
