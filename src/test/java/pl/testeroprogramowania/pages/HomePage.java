package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "menu-item-22")
    private WebElement myAccountLink;

    @FindBy(id = "menu-item-21")
    private WebElement shopLink;

    @FindBy(id = "menu-item-20")
    private WebElement cartLink;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MyAccountPage openMyAccountPage() {
        myAccountLink.click();
        return new MyAccountPage(driver);
    }

    public ProductListPage openShopPage() {
        shopLink.click();
        return new ProductListPage(driver);
    }

    public CartPage openCartPage() {
        cartLink.click();
        return new CartPage(driver);
    }
}
