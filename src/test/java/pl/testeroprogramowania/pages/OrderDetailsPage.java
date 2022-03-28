package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsPage {

    private WebDriver driver;

    public OrderDetailsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
