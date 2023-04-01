Feature: Configuración de aplicación móvil
  Como usuario de la aplicación
  Quiero configurar la aplicación móvil antes de iniciar sesión

  Scenario: Configurar aplicación móvil con éxito
    Given Se visualiza el HomePage del App Mibanco
    When Se da click click al botón Ingresa aquí
    Then Se visualiza el Login del App Mibanco
    When Se mantiene presionado el botón Llámanos
    Then Se visualiza la opción de configuración QA
    When Se da click a la opción de configuración QA
    Then Se visualiza el page de Depuración y se de click en el icono de configuración
    When Se desactiva la opción Mutual Auth
    And  Se desactiva la opción SSL Pinning
    And  Se desactiva la opción EnrollmentProccess
    And  Se da click en el botón ocultar
    Then Se visualiza el Login del App Mibanco QA

