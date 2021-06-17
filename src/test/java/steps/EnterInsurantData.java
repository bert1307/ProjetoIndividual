package steps;


import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import setupObj.Setup;

public class EnterInsurantData {
	
	@Dado("que escrevo no campo first name {string}")
	public void que_escrevo_no_campo_first_name(String name) {
		Setup.id("firstname").sendKeys(name);
	}

	@Dado("escrevo no campo last name {string}")
	public void escrevo_no_campo_last_name(String lastName) {
		Setup.id("lastname").sendKeys(lastName);
	}

	@Dado("escrevo no campo date of birth {string}")
	public void escrevo_no_campo_date_of_birth(String birth) {
		Setup.id("birthdate").sendKeys(birth);
	}

	@Dado("clico no botao do gender")
	public void clico_no_botao_do_gender() {
		Setup.cssSelector("span[class='ideal-radio']").click();	
	}

	@Dado("seleciono o campo country")
	public void seleciono_o_campo_country() {	    
	    Setup.cssSelector("option[value='Brazil']").click();
	    
	}

	@Dado("escrevo no campo zip code {string}")
	public void escrevo_no_campo_zip_code(String cep) {
		Setup.id("zipcode").sendKeys(cep);
	}

	@Dado("seleciono o campo occupation")
	public void seleciono_o_campo_occupation() {
		Setup.id("occupation").click();
		Setup.cssSelector("option[value='Employee']").click();
	}

	@Dado("escolho o campo hobbies")
	public void escolho_o_campo_hobbies() {
		Setup.cssSelector("span[class='ideal-check']").click();
	}

	@Entao("clico no segundo botao")
	public void clico_no_segundo_botao() {
		Setup.id("nextenterproductdata").click();
	}
	

}
