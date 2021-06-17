package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import setupObj.Setup;

public class EnterVehicleData {
	

	@Dado("que estou no site {string}")
	public void que_estou_no_site(String site) {
	   Setup.openBrowser(site);
	}

	@Dado("seleciono uma opcao no campo make")
	public void seleciono_uma_opcao_no_campo_make() {
	    Setup.driver.navigate().refresh();
	    Setup.id("make").click();
	    Setup.cssSelector("option[value='Honda']").click();
	    
	}

	@Dado("escrevo no proximo campo enginee performance {string}")
	public void escrevo_no_proximo_campo_enginee_performance(String engPerf) {
		Setup.id("engineperformance").sendKeys(engPerf);
		
	}

	@Dado("escrevo no proximo campo date")
	public void escrevo_no_proximo_campo_date() {
	    Setup.cssSelector("button[class='ui-datepicker-trigger']").click();
	    Setup.linkText("16").click();
	}

	@Dado("seleciono para escolher uma opcao no campo number of seats")
	public void seleciono_para_escolher_uma_opcao_no_campo_number_of_seats() {
	    Setup.id("numberofseats").click();
	    Setup.cssSelector("option[value='5']").click();
	}

	@Dado("seleciono para escolher uma opcao no campo fuel type")
	public void seleciono_para_escolher_uma_opcao_no_campo_fuel_type() {
		Setup.id("fuel").click();
		Setup.cssSelector("option[value='Petrol']").click();
	}

	@Dado("escrevo no proximo campo list price {string}")
	public void escrevo_no_proximo_campo_list_price(String price) {
		Setup.id("listprice").sendKeys(price);
	}

	@Dado("escrevo no proximo campo license plate number {string}")
	public void escrevo_no_proximo_campo_license_plate_number(String license) {
	   Setup.id("licenseplatenumber").sendKeys(license);
	}

	@Dado("escrevo no proximo campo annual mileage {string}")
	public void escrevo_no_proximo_campo_annual_mileage(String annual) {
		Setup.id("annualmileage").sendKeys(annual);
	}

	@Entao("clico no botao")
	public void clico_no_botao() {
		Setup.id("nextenterinsurantdata").click();
	}


}
