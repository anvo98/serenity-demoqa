Feature: Automatizar la página de: demoqa

  Scenario Outline:Se debe de ingresar a la opción elements web tables y agregar un nuevo registro y que me permita eliminar cualquier registro que este en la tabla.
    Given El usuario ingresa a la pagina de demo qa
    When  Ingresar a la opcion elements web tables
    Then  Agregar un nuevo registro '<firstName>','<lastName>','<userEmail>','<age>','<salary>','<department>'
    Examples:
      | firstName | lastName | userEmail     | age | salary | department |
      | juan      | osorio   | asda@asd.com  | 33  | 52050  | bogota     |
      | leo       | jimenez  | leo@gmail.com | 43  | 53200  | medellin   |


  Scenario Outline: Se debe ingresar a la opción Widgets - Date Picker y seleccionar cualquier fecha en las
  opciones (Select Date y Date And Time).
    Given El usuario ingresa a la pagina de demo qa
    When  A la opción Widgets - Date Picker
    Then Selecciona cualquier fecha en las opciones '<Select Date>' y '<Date And Time>' con el formato '03/28/2023' y 'November 24, 2023 10:45 PM.'
    Examples:
      | Select Date | Date And Time              |
      | 03/28/1998  | Dicember 12, 2016 11:45 PM |
      | 03/28/2023  | November 24, 2023 10:45 PM |

  Scenario: Se debe ingresar a la opción Alerts Frame Windows. Alerts se debe de interactuar con las 4 tipos de ventanas emergentes tanto parar activarlas como para cerrarlas.
    Given El usuario ingresa a la pagina de demo qa
    When  A la opción Alerts Frame Windows
    Then  'Nicolas' Interactua con los cuatro tipos de ventanas emergentes
