package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    @FindBy(id="order_payments_attributes__payment_method_id_3")
    WebElement paymentOption;

    @FindBy(name="commit")
    WebElement save;

    public PaymentPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void selectPayment()
    {
        paymentOption.click();
        save.click();
    }

}
