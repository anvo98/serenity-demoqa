package starter.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DemoQAElements extends PageObject {
    @FindBy(id = "item-3")
    public WebElementFacade webTables ;
}