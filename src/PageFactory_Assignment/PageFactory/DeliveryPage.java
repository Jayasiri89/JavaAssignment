package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage{

    @FindBy(name="order[shipments_attributes][0][selected_shipping_rate_id]")
    WebElement shippingMethod;

    @FindBy(name="commit")
            WebElement save;
    public DeliveryPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void addShipingMethod()
    {
        shippingMethod.click();
        save.click();
    }

}
