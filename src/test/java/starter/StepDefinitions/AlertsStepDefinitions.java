package starter.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Navigation.NavigateTo;
import starter.Step.Alerts;

public class AlertsStepDefinitions {
    @Steps
    NavigateTo navigateTo;
    @Steps
    Alerts alerts;
    @When("A la opción Alerts Frame Windows")
    public void a_la_opción_alerts_frame_windows() throws InterruptedException {
        alerts.ChoiseAlerts();
    }
    @Then("{string} Interactua con los cuatro tipos de ventanas emergentes")
    public void interactua_con_los_cuatro_tipos_de_ventanas_emergentes(String stringAlert) throws InterruptedException {
        alerts.InteractionsAlert(stringAlert);
    }


}
