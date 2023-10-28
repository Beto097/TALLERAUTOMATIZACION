# encoding: UTF-8

Feature: Modulo pacientes de Medilapp
  Yo como usuario
  Quiero que se verifique que los campos de la tabla de pacientes son correctos
  Para que se manejen los controles de inicio de sesión correctamente

  Background:
    Given quiero ingresar a medilapp
    When ingreso los datos de inicio de sesion
      |     strUser     |  strPassword |
      | certificacion   |    12345678  |

  Scenario: Consultar cabeceras de tabla de pacientes
    When ingreso al modulo de pacientes
    Then el usuario deberia ver los siguientes campos de encabezados en pantalla
      |   ID CÉDULA NOMBRE SEXO EDAD TELEFONO EMAIL ACCIONES|

  # EN OCASIONES LA VERIFICACION DEBE INGRESAR LOS DATOS POR SEPARADO DEPENDIENTO DEL ELEMENTO WEB
    #  |   CÉDULA   |
    #  |   NOMBRE   |
    #  |   SEXO     |
    #  |   EDAD     |
    #  |  TELEFONO  |
    #  |   EMAIL    |
    #  |  ACCIONES  |

  @22
  Scenario: Actualizar Paciente en modulo de listado de pacientes
    When ingreso al modulo de pacientes
    Then Ingreso a la opcion de actualizar paciente y modifico los datos
    |   strTelefono  |     strCorreo      |
    |     68451102   |    pueba@choucair  |
    And se debe mostrar un mensaje de modificacion exitosa
    |                 strExitoso             |
    | Se Modificó el Paciente Correctamente! |
