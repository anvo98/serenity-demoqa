package starter.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.RegistrationForm;
import starter.Navigation.NavigateTo;

public class SearchStepDefinitions {
    @Steps
    NavigateTo navigateTo;
    @Steps
    RegistrationForm lookForInformation;

    @Given("El usuario ingresa a la pagina de demo qa")
    public void el_usuario_ingresa_a_la_pagina_de_demo_qa() {
        navigateTo.DemoQA();
    }

    @When("Ingresar a la opcion elements web tables")
    public void ingresar_a_la_opcion_elements_web_tables() throws InterruptedException {
        lookForInformation.ChoiseElementsWebTables();
    }

    @Then("Agregar un nuevo registro {string},{string},{string},{string},{string},{string}")
    public void agregar_un_nuevo_registro(String firstName, String lastName, String userEmail, String age, String salary, String department) {
        lookForInformation.RegistrationForm(firstName, lastName, userEmail, age, salary, department);
    }
}
