Feature: Pago planillas


  Scenario: Un nuevo comercio desea afiliarse al programa pago planilla
    Given un nuevo comercio que no esta afiliado al programa
    When el comercio se registra al programa
    Then espera el comercio debera tener el estatus afiliado

