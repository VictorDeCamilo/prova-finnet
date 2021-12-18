
@login
Feature: Realizar login
  Como usuario quero acessar o site da prova para validar a funcionalidade de login

  
  Scenario: Realizar login com dados corretos
    Given que esteja no site da prova da finnet "http://automationpractice.com/index.php"
    When clico no botão de logar
    And preencho com dados já cadastrados
    Then valido o sucesso do login
    
  Scenario: Realizar login com dados incorretos
	  Given que esteja no site da prova da finnet "http://automationpractice.com/index.php"
    When clico no botão de logar
    But preencho com um e-mail não cadastrado
    Then valido o fracasso do login