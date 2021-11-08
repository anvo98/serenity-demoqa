package starter.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/")
public class DemoQAHomePage extends PageObject {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]")
    public WebElementFacade elements ;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]")
    public WebElementFacade widgets ;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]")
    public WebElementFacade alertsFrameWindows ;
}