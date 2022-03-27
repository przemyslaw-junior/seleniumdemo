package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void logInTest() {

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .logInValidData("juniortest@gmail.com", "juniortest@gmail.com" )
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void logInWithInvalidPasswordTest(){
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .logInInvalidData("juniortest@gmail.com", "test@gmail.com")
                .getError();

        Assert.assertTrue(error.getText()
                .contains("Incorrect username or password."), "Expected error text doesn't match'");

    }
}
