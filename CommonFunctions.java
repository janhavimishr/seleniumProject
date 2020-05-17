package String_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class CommonFunctions {

		
		public void click(String objectKey) 
		{
			getObject(objectKey).click();
		}

		private Object getObject(String objectKey) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public static WebDriver basicSetup() {

			//System.out.println("hello inside ebady class");
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
						"\\drivers\\chromedriver.exe");
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
				WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.navigate().to("https://www.ebay.com");
			
			return driver;
			}
		}
	}


