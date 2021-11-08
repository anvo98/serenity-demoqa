package starter.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DemoQAWebTables extends PageObject {
    @FindBy(id = "addNewRecordButton")
    public WebElementFacade addButton ;
    @FindBy(id = "firstName")
    public WebElementFacade firstName ;
    @FindBy(id = "lastName")
    public WebElementFacade lastName ;
    @FindBy(id = "userEmail")
    public WebElementFacade userEmail ;
    @FindBy(id = "age")
    public WebElementFacade age ;
    @FindBy(id = "salary")
    public WebElementFacade salary ;
    @FindBy(id = "department")
    public WebElementFacade department ;
    @FindBy(id = "submit")
    public WebElementFacade submit ;
    @FindBy(xpath= "/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div/div")
    public List<WebElementFacade> table ;
}