package String_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;


public class EbayHomePage extends CommonFunctions {
	
	public static void main (String[] args) { 
		
		//System.setProperty(ChromeDriver, arg1)	
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
				"\\drivers\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://www.ebay.com");*/
	WebDriver driver= basicSetup();
	String textbox="gh-ac";
	String searchBox="gh-btn";
	driver.findElement(By.id(textbox)).sendKeys("Badminton");
	driver.findElement(By.id(searchBox)).click();
	
	
}
	
