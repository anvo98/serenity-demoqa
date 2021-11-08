package starter.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DemoQADatePicker extends PageObject {
    @FindBy(id = "datePickerMonthYearInput")
    public WebElementFacade datePickerMonthYearInput;
    @FindBy(id = "dateAndTimePickerInput")
    public WebElementFacade dateAndTimePickerInput;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div")
    public WebElementFacade mainHeader;
}