package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("estoy usando el sistema de planillas")
    public void estoyUsandoElSistemaDePlanillas() {

    }

    @When("estoy ingresando un nuevo empleado")
    public void estoyIngresandoUnNuevoEmpleado() {

        
    }

    @Then("espero que el usuario haya sido creado y verlo en la lista de empleados")
    public void esperoQueElUsuarioHayaSidoCreadoYVerloEnLaListaDeEmpleados() {
        
    }

    @And("verlo en la lista de empleados")
    public void verloEnLaListaDeEmpleados() {
    }

    @When("estoy borrando un nuevo empleado")
    public void estoyBorrandoUnNuevoEmpleado() {


    }

    @Then("espero que tengo un descuento descuento_comercio %")
    public void esperoQueTengoUnDescuentoDescuento_comercio() {

    }


    @When("el comercio se registra al programa")
    public void elComercioSeRegistraAlPrograma() {
        ComercioBuild comercioBuild = new ComercioBuild();
        Comercio comercio = comercioBuild.withDisccount(10).name("ketal").build();
    }

    @Given("un nuevo comercio que no esta afiliado al programa")
    public void unNuevoComercioQueNoEstaAfiliadoAlPrograma() {

    }

    @Then("espera el comercio debera tener el estatus afiliado")
    public void esperaElComercioDeberaTenerElEstatusAfiliado() {
    }
}
