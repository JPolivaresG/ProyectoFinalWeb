
//JUAN PABLO OLIVARES GARCIA FOR TCS
package com.mercadolibre.web.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com.co/")
public class LoginPageObject extends PageObject {
	
	String btn_ingresar="//nav[@id='nav-header-menu']/a[2]";
	String txt_usuario="user_id";//input[@id='user_id']
	String btn_validaruser="//input[@type='submit']";
	String txt_contrasena="password";//input[@id='password']
	String btn_validapsw="//button[@id='action-complete']";
	String lbl_user="//span[@class='nav-header-username']";
	
	public void ingresar_Usuario(String user, String password) throws InterruptedException {
		find(By.xpath(btn_ingresar)).click();
		find(By.id(txt_usuario)).sendKeys(user);
		find(By.xpath(btn_validaruser)).click();
		Thread.sleep(500);
		find(By.id(txt_contrasena)).sendKeys(password);
		find(By.xpath(btn_validapsw)).click();
	}
	public void validacion_Ingreso() {
		assertEquals("El usuario no es el esperado", "Caroo150", find(By.xpath(lbl_user)).getText());
	}
}
