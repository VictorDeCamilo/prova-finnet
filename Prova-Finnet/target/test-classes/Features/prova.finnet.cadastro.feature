
@cadastro
Feature: Realizar um cadastro
  Como usuario quero acessar o site da prova para validar um cadastro

  
  Scenario: Realizar cadastro com dados corretos
    Given que entre no site da prova da finnet "http://automationpractice.com/index.php"
    When clico em Sign In
    And preencho com dados validos
    And clico em Create an account
    Then valido o sucesso do cadastro
    
  Scenario: Realizar cadastro com dados incorretos
	  Given que entre no site da prova da finnet "http://automationpractice.com/index.php"
    When clico em Sign In
    But preencho com um e-mail já cadastrado
    And clico em Create an account
    Then valido o fracasso do cadastro