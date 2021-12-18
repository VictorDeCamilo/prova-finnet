package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By signIn = By.className("login");
	public By createAnAccount = By.id("SubmitCreate");
	public By emailCadastro = By.name("email_create");
	public By emailLogin = By.id("email");
	public By senha = By.id("passwd");
	public By login = By.id("SubmitLogin");
	public By genero = By.xpath("//*[@id=\"id_gender1\"]");
	public By primeiroNome = By.cssSelector("#customer_firstname");
	public By ultimoNome = By.id("customer_lastname");
	public By diaNascimento = By.id("days");
	public By anoNascimento = By.id("years");
	public By mesNascimento = By.id("months");
	public By primeiroNome2 = By.id("firstname");
	public By ultimoNome2 = By.id("lastname");
	public By endereco = By.id("address1");
	public By cidade = By.id("city");
	public By estado = By.id("id_state");
	public By codigoPostal = By.id("postcode");
	public By telefone = By.id("phone_mobile");
	public By registrar = By.id("submitAccount");

}
