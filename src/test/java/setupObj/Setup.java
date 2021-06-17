package setupObj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Setup {
		
	//metodos configuracao browser

	public static WebDriver driver = null;
		
		
	public static void openBrowser(String urlSite) {
		
		if(driver == null) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\browserDriver/chromedriver.exe");
			driver = new ChromeDriver();		
				
		}
				
		driver.get(urlSite);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
			
		}
	

	//funcoes de identificacao dos elementos HTML
		    
		   		
	public static WebElement id(String selectorId) {
		return driver.findElement(By.id(selectorId));
	}
			
	public static WebElement cssSelector(String selectorCss) {
		return driver.findElement(By.cssSelector(selectorCss));
	}
	
	
	public static WebElement linkText(String selectorLink) {
		return driver.findElement(By.linkText(selectorLink));
	}
			
	public static WebElement xpath(String selectorXpath) {
		return driver.findElement(By.xpath(selectorXpath));
	}	
	
	public static List <WebElement> selectorsCss(String selectorsCss) {
		return driver.findElements(By.cssSelector(selectorsCss));
	}
	
}
