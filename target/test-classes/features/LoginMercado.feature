#Author: Juan Pablo Olivares
#PROYECTO FINAL 

@tag
Feature: Ingreso y validacion de mercadolibre

  @tag2
  Scenario Outline: R1
    Given Ingreso al navegador
    When Ingreso a la web con usuario <user> y contrasena <password>
    Then Valida el ingreso exitoso <user>
        Examples: 
      | user | password |
      | "Caroo150@hotmail.com" | "1813180" |
    
  @tag3
  Scenario Outline: R2
    Given Ingreso al navegador
    When Busqueda de adulto<busqueda>
    Examples: 
      | busqueda |
    | "huevo vibradora"|
