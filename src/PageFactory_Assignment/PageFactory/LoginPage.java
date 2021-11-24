package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(name = "spree_user[email]")
    WebElement email;

    @FindBy(name = "spree_user[password]")
    WebElement pwd;

    @FindBy(name = "commit")
    WebElement login;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }

    public void login(String userEmail, String password)
    {
        email.sendKeys(userEmail);
        pwd.sendKeys(password);
        login.click();
    }
}
