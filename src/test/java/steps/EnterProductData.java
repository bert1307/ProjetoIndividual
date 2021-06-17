package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import setupObj.Setup;

public class EnterProductData {
	
	@Dado("que escrevo no campo start date {string}")
	public void que_escrevo_no_campo_start_date(String startDate) {
		Setup.id("startdate").sendKeys(startDate);
	}

	@Dado("seleciono o campo Insurance Sum")
	public void seleciono_o_campo_insurance_sum() {
		Setup.id("insurancesum").click();
	    Setup.cssSelector("option[value='10000000']").click();
	}

	@Dado("seleciono o campo Merit Rating")
	public void seleciono_o_campo_merit_rating() {
		Setup.id("meritrating").click();
	    Setup.cssSelector("option[value='Bonus 3']").click();
	}

	@Dado("seleciono o campo Damage Insurance")
	public void seleciono_o_campo_damage_insurance() {
		Setup.id("damageinsurance").click();
	    Setup.cssSelector("option[value='No Coverage']").click();
	}

	@Dado("escolho uma opcao no campo Optional Products")
	public void escolho_uma_opcao_no_campo_optional_products() {
		Setup.xpath(("//label[text()='Legal Defense Insurance']")).click();
	}

	@Dado("seleciono o campo Courtesy car")
	public void seleciono_o_campo_courtesy_car() {
		Setup.id("courtesycar").click();
	    Setup.cssSelector("option[value='Yes']").click();
	}

	@Entao("clico no terceiro botao")
	public void clico_no_terceiro_botao() {
		Setup.cssSelector("button[id='nextselectpriceoption']").click();
		
	}


}
