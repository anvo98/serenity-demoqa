package starter.Step;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.PageObject.DemoQAElements;
import starter.PageObject.DemoQAHomePage;
import starter.PageObject.DemoQAWebTables;

public class RegistrationForm extends ScenarioActor {
    @Steps(shared = true)
    DemoQAHomePage demoQAHomePage;
    DemoQAWebTables demoQAWebTables;
    DemoQAElements demoQAElements;


    @Step("ingresar a la opción elements web tables")
    public void ChoiseElementsWebTables() throws InterruptedException {
        demoQAHomePage.evaluateJavascript("window.scroll(0,800)");
        demoQAHomePage.elements.click();
        demoQAHomePage.evaluateJavascript("window.scroll(0,800)");
        demoQAElements.webTables.click();
        Thread.sleep(3000);
        demoQAWebTables.addButton.click();
        Serenity.takeScreenshot();
    }

    @Step("agregar un nuevo registro y imprimir el texto de la tabla con el nuevo registro")
    public void RegistrationForm(String firstName, String lastName, String userEmail, String age,
                                 String salary, String department) {
        demoQAWebTables.firstName.sendKeys(firstName);
        Serenity.takeScreenshot();
        demoQAWebTables.lastName.sendKeys(lastName);
        Serenity.takeScreenshot();
        demoQAWebTables.userEmail.sendKeys(userEmail);
        Serenity.takeScreenshot();
        demoQAWebTables.age.sendKeys(age);
        Serenity.takeScreenshot();
        demoQAWebTables.salary.sendKeys(salary);
        Serenity.takeScreenshot();
        demoQAWebTables.department.sendKeys(department);
        Serenity.takeScreenshot();
        demoQAWebTables.submit.click();
        for (int i = 0; i < demoQAWebTables.table.size(); i++) {
            System.out.println(demoQAWebTables.table.get(i).getText());
        }
        Serenity.takeScreenshot();
    }
}
