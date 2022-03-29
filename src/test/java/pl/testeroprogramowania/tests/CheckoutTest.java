package pl.testeroprogramowania.tests;

import org.testng.annotations.Test;
import pl.testeroprogramowania.models.Customer;
import pl.testeroprogramowania.pages.HomePage;

public class CheckoutTest extends BaseTest{

    @Test
    public void checkoutTest() {

        Customer customer = new Customer();
        customer.setFirstName("first Name");
        customer.setLastName("Last Name");
        customer.setCompanyName("Company");
        customer.setCountry("Poland");
        customer.setStreet("Street");
        customer.setZipCode("123");
        customer.setCity("City");
        customer.setPhone("123456789");
        customer.setEmail("Test@gmail.com");

        new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .openAddressDetails()
                .fillAddressDetails(customer,"Some random comment");
    }
}
