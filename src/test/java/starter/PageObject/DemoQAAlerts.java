package starter.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
public class DemoQAAlerts extends PageObject {
    @FindBy(id = "alertButton")
    public WebElementFacade alertButton ;
    @FindBy(id = "timerAlertButton")
    public WebElementFacade timerAlertButton;
    @FindBy(id = "confirmButton")
    public WebElementFacade confirmButton;
    @FindBy(id = "promtButton")
    public WebElementFacade promtButton;
}