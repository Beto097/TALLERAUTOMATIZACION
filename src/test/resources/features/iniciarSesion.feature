# encoding: UTF-8

Feature: Inicio de Sesion Medilapp sitio web
  Yo como usuario
  Quiero que el sitio tenga un login adecuado y sencillo
  Para que se manejen los controles de inicio de sesión correctamente


  Scenario: Inicio de sesion exitoso
    Given quiero ingresar a medilapp
    When ingreso los datos de inicio de sesion
      |     strUser     |  strPassword |
      | certificacion   |    12345678  |
    Then debe encontrar en la pagina principal el label
      |    strInicio       |
      |  Ordenes Por Doctor|

    @Scenariofail
  Scenario: Inicio de sesion usuario incorrecto y contrasena correcta
    Given quiero ingresar a medilapp
    When ingreso los datos de inicio de sesion
      |     strUser       |  strPassword |
      | certificacion12   |    12345678  |
    Then debe mostrarse mensaje de error
      |      strError         |
      |  INICIAR SESIÓN      |

  Scenario: Inicio de sesion usuario correcto y contrasena incorrecta
    Given quiero ingresar a medilapp
    When ingreso los datos de inicio de sesion
      |     strUser       |  strPassword |
      | certificacion   |    87654321  |
    Then debe mostrarse mensaje de error
      |      strError         |
      |  INICIAR SESIÓN      |