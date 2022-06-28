package LoginDemo_Acti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_DemoPOM {
	//WebDriver driver;
	@FindBy(id="username") private WebElement  un;
	@FindBy(id="password") private WebElement  pw;
	@FindBy(xpath="//div[text()='Login']") private WebElement  login;
	
	Login_DemoPOM(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	 public WebElement getUn(){
		 return un;
	 }
	 public WebElement getPw() {
		 return pw;
	 }
	 public WebElement getLogin() {
		 return login;
	 }

	

}
