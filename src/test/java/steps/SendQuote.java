package steps;

import org.junit.Assert;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;

import setupObj.Setup;

public class SendQuote {
	
	@Dado("que digito o email {string}")
	public void que_digito_o_email(String email) {
	    Setup.id("email").sendKeys(email);
	}

	@Dado("digito no campo phone {string}")
	public void digito_no_campo_phone(String phone) {
	    Setup.id("phone").sendKeys(phone);
	}

	@Dado("digito no campo username {string}")
	public void digito_no_campo_username(String userName) {
		Setup.id("username").sendKeys(userName);
	}

	@Dado("digito no campo password {string}")
	public void digito_no_campo_password(String password) {
	    Setup.id("password").sendKeys(password);
	}

	@Dado("confirmo a senha {string}")
	public void confirmo_a_senha(String confirmPassword) {
		Setup.id("confirmpassword").sendKeys(confirmPassword);
	}

	@Dado("digito um comentario {string}")
	public void digito_um_comentario(String comment) {
	    Setup.id("Comments").sendKeys(comment);
	}

	@Dado("clico no ultimo botao")
	public void clico_no_ultimo_botao() {
	    Setup.id("sendemail").click();
	}
	
	@Entao("deve aparecer a mensagem de {string}")
	public void deve_aparecer_a_mensagem_de(String message) {
	    Assert.assertEquals(message, Setup.xpath("//h2[text()='Sending e-mail success!']").getText());
	}

	
}
