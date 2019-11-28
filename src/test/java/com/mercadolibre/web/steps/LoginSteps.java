package com.mercadolibre.web.steps;

import com.mercadolibre.web.pageObjects.LoginPageObject;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
LoginPageObject loginPageObject;

@Step
public void ingreso_al_Navegador() {
	loginPageObject.open();
}
@Step
public void seleccion_Pais() throws InterruptedException {
	Thread.sleep(1000);
loginPageObject.seleccion_Pais();
}
@Step
public void ingreso_de_Datos(String user, String password) throws InterruptedException {
	Thread.sleep(1000);
loginPageObject.ingresar_Usuario(user,password);
}
@Step
public void validacion_Ingreso(String user) {
	loginPageObject.validacion_Ingreso(user);
}
@Step
public void busqueda_Adultos(String busqueda) throws InterruptedException {
	Thread.sleep(1000);
	loginPageObject.busqueda_Adulta(busqueda);
}
@Step
public void valida_el_Mensaje() throws InterruptedException {
	Thread.sleep(1000);
	loginPageObject.valida_el_Mensaje();
}

}