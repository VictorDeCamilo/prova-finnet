package Steps;

import Elementos.Elementos;
import Pages.Browser;
import Pages.MetodosDeTeste;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProvaFinnetCadastro {
	
	Browser browser = new Browser();
	MetodosDeTeste metodos = new MetodosDeTeste();
	Elementos elementos = new Elementos();
	
	@Given("que entre no site da prova da finnet {string}")
	public void que_entre_no_site_da_prova_da_finnet(String site) {
	    
		browser.abrirNavegador(site);
		
	}

	@When("clico em Sign In")
	public void clico_em_sign_in() {
		
		metodos.esperarElementoClicavel(elementos.signIn, 1000);
		metodos.clicar(elementos.signIn);
		metodos.pausa(500);
		
	}

	@When("preencho com dados validos")
	public void preencho_com_dados_validos() {
	 
		metodos.esperarElementoClicavel(elementos.emailCadastro, 1000);
		metodos.escrever(elementos.emailCadastro, "2c0d3c52c5@emailnax.com");
		metodos.esperarElementoClicavel(elementos.createAnAccount, 1000);
		metodos.clicar(elementos.createAnAccount);
		metodos.esperarElementoClicavel(elementos.primeiroNome, 6500);
		metodos.escrever(elementos.primeiroNome, "Afonso");
		metodos.escrever(elementos.ultimoNome, "Alonso");
		metodos.escrever(elementos.senha, "123123");
		metodos.escrever(elementos.diaNascimento, "12");
		metodos.escrever(elementos.mesNascimento, "November");
		metodos.escrever(elementos.anoNascimento, "1993");
		metodos.escrever(elementos.primeiroNome2, "Afonso");
		metodos.escrever(elementos.ultimoNome2, "Alonso");
		metodos.escrever(elementos.endereco, "490 8th Ave");
		metodos.escrever(elementos.cidade, "New York");
		metodos.escrever(elementos.estado, "New York");
		metodos.escrever(elementos.codigoPostal, "10001");
		metodos.escrever(elementos.telefone, "222-222-2222");		
		
	}

	@When("clico em Create an account")
	public void clico_em_create_an_account() {
		
		metodos.pausa(1000);
		metodos.clicar(elementos.registrar);
		
	}

	@Then("valido o sucesso do cadastro")
	public void valido_o_sucesso_do_cadastro() {
	   
		metodos.pausa(1000);
		metodos.screenShot("CT01 - CADASTRO POSITIVO");
		browser.fecharNavegador();
	}


	@When("preencho com um e-mail já cadastrado")
	public void preencho_com_um_e_mail_já_cadastrado() {
		metodos.pausa(1000);
		metodos.escrever(elementos.emailCadastro, "bb09de7d47@emailnax.com");
		metodos.clicar(elementos.createAnAccount);
	}
	
	@Then("valido o fracasso do cadastro")
	public void valido_o_fracasso_do_cadastro() {
		
		metodos.pausa(3500);
		metodos.screenShot("CT02 - CADASTRO NEGATIVO");
		browser.fecharNavegador();

	}
}