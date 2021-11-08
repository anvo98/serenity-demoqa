package starter.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.PageObject.DemoQADatePicker;
import starter.PageObject.DemoQAHomePage;
import starter.PageObject.DemoQAWidgets;

public class DatePicker extends ScenarioActor {
    @Steps(shared = true)
    DemoQAHomePage demoQAHomePage;
    DemoQAWidgets demoQAWidgets;
    DemoQADatePicker demoQADatePicker;
    @Step("ingresar a la opción Widgets Date Picker")
    public void ChoiseElementWidgets()  {
    demoQAWidgets.evaluateJavascript("window.scroll(0,800)");
        demoQAHomePage.widgets.click();
        demoQAWidgets.evaluateJavascript("window.scroll(0,800)");
        demoQAWidgets.datePicker.click();
    }

    @Step("seleccionar cualquier fecha en las opciones (Select Date y Date And Time).")
    public void SelectInputsDatePicker(String datePickerMonthYearInput,String dateAndTimePickerInput)  {
        demoQADatePicker.datePickerMonthYearInput.clear();
        demoQADatePicker.datePickerMonthYearInput.sendKeys(datePickerMonthYearInput);
        Serenity.takeScreenshot();
        demoQADatePicker.mainHeader.click();
        demoQADatePicker.dateAndTimePickerInput.clear();
        demoQADatePicker.dateAndTimePickerInput.sendKeys(dateAndTimePickerInput);
        Serenity.takeScreenshot();
        demoQADatePicker.mainHeader.click();
    }
}
