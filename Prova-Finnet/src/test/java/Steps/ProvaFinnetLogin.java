package Steps;

import Elementos.Elementos;
import Pages.Browser;
import Pages.MetodosDeTeste;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProvaFinnetLogin {

	Browser browser = new Browser();
	MetodosDeTeste metodos = new MetodosDeTeste();
	Elementos elementos = new Elementos();
	
	@Given("que esteja no site da prova da finnet {string}")
	public void que_esteja_no_site_da_prova_da_finnet(String site) {
	  
		browser.abrirNavegador(site);
		
	}

	@When("clico no botão de logar")
	public void clico_no_botão_de_logar() {
	   
		metodos.esperarElementoClicavel(elementos.signIn, 1000);
		metodos.clicar(elementos.signIn);
		metodos.pausa(500);		
	}

	@When("preencho com dados já cadastrados")
	public void preencho_com_dados_já_cadastrados() {
	
		metodos.esperarElementoClicavel(elementos.emailLogin, 1000);
		metodos.escrever(elementos.emailLogin, "84578af71c@emailnax.com");
		metodos.escrever(elementos.senha, "123123");
		metodos.clicar(elementos.login);
		
	}

	@Then("valido o sucesso do login")
	public void valido_o_sucesso_do_login() {
	
		metodos.pausa(1000);
		metodos.screenShot("CT03 - LOGIN POSITIVO");
		browser.fecharNavegador();
		
	}

	@When("preencho com um e-mail não cadastrado")
	public void preencho_com_um_e_mail_não_cadastrado() {

		metodos.esperarElementoClicavel(elementos.emailLogin, 1000);
		metodos.escrever(elementos.emailLogin, "123123@123.com");
		metodos.escrever(elementos.senha, "123123");
		metodos.clicar(elementos.login);
		
	}

	@Then("valido o fracasso do login")
	public void valido_o_fracasso_do_login() {
	
		metodos.pausa(3500);
		metodos.screenShot("CT04 - LOGIN NEGATIVO");
		browser.fecharNavegador();

	}
}
