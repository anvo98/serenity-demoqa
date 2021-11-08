package starter.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Navigation.NavigateTo;
import starter.Step.DatePicker;


public class DatePickerStepDefinitions {
    @Steps
    NavigateTo navigateTo;
    @Steps
    DatePicker datePicker;

    @When("A la opción Widgets - Date Picker")
    public void a_la_opción_widgets_date_picker() {
        datePicker.ChoiseElementWidgets();

    }

    @Then("Selecciona cualquier fecha en las opciones {string} y {string} con el formato {string} y {string}")
    public void seleccionar_cualquier_fecha_en_las_opciones_select_date_y_date_and_time(String datePickerMonthYearInput,String dateAndTimePickerInput,String String3,String String4) {
        datePicker.SelectInputsDatePicker(datePickerMonthYearInput,dateAndTimePickerInput);
    }

}
