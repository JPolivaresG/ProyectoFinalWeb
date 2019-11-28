
//JUAN PABLO OLIVARES GARCIA FOR TCS
package com.mercadolibre.web.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com/")
public class LoginPageObject extends PageObject {
	String btn_pais="//a[@id=\"CO\"]";
	String btn_ingresar="//nav[@id='nav-header-menu']/a[2]";
	String txt_usuario="//input[@id='user_id']";
	String btn_validaruser="//input[@class='ui-button ui-button--primary auth-button auth-button--user']";
	String txt_contrasena="//input[@id='password']";
	String btn_validapsw="//button[@id='action-complete']";
	String lbl_user="//span[@class='nav-header-username']";
	String txt_buscar="//input[@class='nav-search-input']";
	String btn_buscar="//button[@class='nav-search-btn']";
	String lbl_captcha="//*[@id'login_user_form']/div[1]/div[2]/div[2]/div";//div[@id='rc-anchor-container']
	String pop_adultos="//*[@id=\"root-app\"]/section/div/div[1]/h2";
	
	public void seleccion_Pais() {
		find(By.xpath(btn_pais)).click();
	}
	
	public void ingresar_Usuario(String user, String password) throws InterruptedException {
		find(By.xpath(btn_ingresar)).click();
		Thread.sleep(5000);
		find(By.xpath(txt_usuario)).sendKeys(user);
		Thread.sleep(5000);
		assertEquals("Aparece un captcha no se puede AUTOMATIZAR",false, find(By.xpath(lbl_captcha)).isVisible());
		find(By.xpath(btn_validaruser)).click();
		Thread.sleep(1000);
		find(By.xpath(txt_contrasena)).sendKeys(password);
		find(By.xpath(btn_validapsw)).click();
		assertEquals("Aparece un captcha no se puede AUTOMATIZAR",false, find(By.xpath(lbl_captcha)).isVisible());
	}
	public void validacion_Ingreso(String user) {
		String[] usuario = user.split("@");
		assertEquals("El usuario no es el esperado", usuario[0], find(By.xpath(lbl_user)).getText());
	}
	
	public void busqueda_Adulta(String busqueda) {
		find(By.xpath(txt_buscar)).sendKeys(busqueda);
		find(By.xpath(btn_buscar)).click();
	}
	
	public void valida_el_Mensaje() {
		assertEquals("No es una busqueda de adultos", "Ver resultados para Adultos", find(By.xpath(pop_adultos)).getText());
	}
	
}
