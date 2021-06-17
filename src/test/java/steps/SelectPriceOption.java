package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import setupObj.Setup;

public class SelectPriceOption {
	
	@Dado("que eu seleciono o preco")
	public void que_eu_seleciono_o_preco() {
		
		Setup.selectorsCss(".ideal-radio").get(4).click();
	}

	@Entao("clico no quarto botao")
	public void clico_no_quarto_botao() {
		
		Setup.id("nextsendquote").click();	
		
	}


}
