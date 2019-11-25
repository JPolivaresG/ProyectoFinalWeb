package com.mercadolibre.web.steps;

import com.mercadolibre.web.pageObjects.LoginPageObject;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
LoginPageObject loginPageObject;

@Step
public void ingreso_al_Navegador() {
	loginPageObject.open();
}
public void ingreso_de_Datos(String user, String password) throws InterruptedException {
	Thread.sleep(1000);
loginPageObject.ingresar_Usuario(user,password);
}
public void validacion_Ingreso() {
	loginPageObject.validacion_Ingreso();
}
}