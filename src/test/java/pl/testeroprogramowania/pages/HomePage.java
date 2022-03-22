package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy (id="menu-item-22")
    private WebElement myAccountLink;

    private WebDriver driver;

    public HomePage (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public MyAccountPage openMyAccountPage(){
        myAccountLink.click();
        return new MyAccountPage(driver);
    }
}
