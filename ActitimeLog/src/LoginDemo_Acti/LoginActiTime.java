package LoginDemo_Acti;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginActiTime {

	@Test
	public void logINActi() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARISH\\eclipse-workspace\\New\\InTouchCRM\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.actitime.com/login.do");
	 Login_DemoPOM p =new Login_DemoPOM(driver);
	 Thread.sleep(3000);
	 p.getUn().sendKeys("admin");
     p.getPw().sendKeys("manager");
     p.getLogin().click();
	 {
		 PageFactory.initElements(driver, this);
	 }
	}
}
