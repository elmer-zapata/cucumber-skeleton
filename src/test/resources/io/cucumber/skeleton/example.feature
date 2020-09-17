Feature: Pago planillas
  Scenario: Como usuario puedo dar de alta un nuevo empleado
    Given estoy usando el sistema de planillas
    When estoy ingresando un nuevo empleado
    Then espero que el usuario haya sido creado y verlo en la lista de empleados
    And verlo en la lista de empleados
