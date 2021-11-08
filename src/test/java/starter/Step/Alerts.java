package starter.Step;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.PageObject.*;

public class Alerts extends ScenarioActor {
    @Steps(shared = true)
    DemoQAHomePage demoQAHomePage;
    DemoQAAlertsWindows demoQAAlertsWindows;
    DemoQAAlerts demoQAAlerts;

    @Step("ingresar a la opción Alerts,Frame Windows Alerts")
    public void ChoiseAlerts() throws InterruptedException {
        demoQAHomePage.evaluateJavascript("window.scroll(0,800)");
        demoQAHomePage.alertsFrameWindows.click();
        Thread.sleep(3000);
        demoQAHomePage.evaluateJavascript("window.scroll(0,800)");
        Thread.sleep(3000);
        Serenity.takeScreenshot();
        demoQAAlertsWindows.alerts.click();
        Thread.sleep(1000);
        Serenity.takeScreenshot();}

    @Step("se debe de interactuar con las 4 tipos de ventanas emergentes tanto parar activarlas como para cerrarlas.")
    public void InteractionsAlert (String stringAlert) throws InterruptedException {
        demoQAAlerts.alertButton.click();
        Thread.sleep(2000);
        demoQAAlerts.getDriver().switchTo().alert().accept();
        demoQAAlerts.timerAlertButton.click();
        Thread.sleep(6000);
        demoQAAlerts.getDriver().switchTo().alert().accept();
        demoQAAlerts.confirmButton.click();
        Thread.sleep(2000);
        demoQAAlerts.getDriver().switchTo().alert().accept();
        demoQAAlerts.promtButton.click();
        demoQAAlerts.getDriver().switchTo().alert().sendKeys(stringAlert);
        Thread.sleep(2000);
        demoQAAlerts.getDriver().switchTo().alert().accept();
    }
}
