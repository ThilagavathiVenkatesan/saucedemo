package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BaseClass {
public Logout(WebDriver driver){
	super(driver);
	PageFactory.initElements(driver,this);
}
@FindBy(id="react-burger-menu-btn")
WebElement burgermenu;
@FindBy(id ="logout_sidebar_link")
WebElement logout;

public void menu() {
	burgermenu.click();
	logout.click();
}



}
