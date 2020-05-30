package Commonfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class CommonFunctions {
  
	public static WebDriver driver;
	public static Actions action;
	
	public static WebElement we;
		/*public void click(String objectKey) 
		{
			getObject(objectKey).click();
		}

		private Object getObject(String objectKey) {
			// TODO Auto-generated method stub
			return null;
		}*/
		
		public void basicSetup() {
			
			//System.out.println("hello inside ebay class");
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
						"\\drivers\\chromedriver.exe");
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
				driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.navigate().to("https://www.ebay.com");
			action=new Actions(driver);
			
			
			}
		
		public void inputText(String xpath,String text) {
			
			locator(xpath).sendKeys(text);;
			}
		
		public WebElement locator(String loc) {
			WebElement we=null;
			
			if(loc.endsWith("_id")) {
			we=driver.findElement(By.id(loc));	
			}
			else if(loc.endsWith("_class")) {
			we=driver.findElement(By.className(loc));	
			}
			else if(loc.endsWith("_xpath")){
				we=driver.findElement(By.xpath(loc));	
				}
			return we;
			}
		

		
		public void click(String object) throws InterruptedException {
			Thread.sleep(5000);
			//driver.findElement(By.xpath(object)).click();
			locator(object).click();
		}
		
		public void hoverOver(String xpathhover) {
			//Actions action=new Actions(driver);
			we=driver.findElement(By.xpath(xpathhover));
			action.moveToElement(we).perform();
			
		}
		
		public boolean isVisible(String objectvisible) {
			boolean b=driver.findElement(By.xpath(objectvisible)).isDisplayed();
			return b;
		}
		
		public void quitBrowser() {
			driver.close();
		}
		}
	


