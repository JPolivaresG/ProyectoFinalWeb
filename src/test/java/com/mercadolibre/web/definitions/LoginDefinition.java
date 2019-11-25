//JUAN PABLO OLIVARES GARCIA FOR TCS
//EMP: 1813180
package com.mercadolibre.web.definitions;

import com.mercadolibre.web.steps.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {
	@Steps
	LoginSteps loginSteps;
	
	@Given("^Ingreso al navegador$")
	public void ingreso_al_navegador() {
		loginSteps.ingreso_al_Navegador();

	}

	@When("^Ingreso a la web con usuario \"([^\"]*)\" y contrasena \"([^\"]*)\"$")
	public void ingreso_a_la_web_con_usuario_y_contrasena(String user, String password) throws InterruptedException {
		loginSteps.ingreso_de_Datos(user,password);

	}

	@Then("^Valida el ingreso exitoso$")
	public void valida_el_ingreso_exitoso() {
		loginSteps.validacion_Ingreso();
	}

	@When("^Busqueda de adulto\"([^\"]*)\"$")
	public void busqueda_de_adulto(String busqueda) {

	}

	@Then("^Valida el mensaje de advertencia$")
	public void valida_el_mensaje_de_advertencia() {

	}


}
