package screens;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen extends BaseClass {
	//constructor
public LoginScreen(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver,this);
}
 @FindBy(id= "user-name")
 WebElement name;
 @FindBy(id = "password")
 WebElement password;
 @FindBy(name = "login-button")
 WebElement loginbutton;

 
public void name(String names) {
 name.sendKeys(names);
}
public void password(String pwd) {
	password.sendKeys(pwd);
}
public void loginbutton(String button) {
	loginbutton.click();
}
}