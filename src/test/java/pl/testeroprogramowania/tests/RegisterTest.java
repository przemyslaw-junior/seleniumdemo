package pl.testeroprogramowania.tests;

import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        new HomePage(driver).openMyAccountPage()
                .registerUser("juniortest@gmail.com", "juniortest@gmail.com" );
    }
}
