package Logo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LoginTest {
	public static WebDriver driver;
	@Before
	public void openBrowser()  {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARISH\\eclipse-workspace\\New\\InTouchCRM\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 
		 }
	@After 
	public void closeBrowser() {
		driver.quit();
	}

}
