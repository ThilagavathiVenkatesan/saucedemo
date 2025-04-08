package screens;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart extends BaseClass {
public  Cart(WebDriver driver){
	 super(driver);
	 PageFactory.initElements(driver, this);
	 
 }
 @FindBy(xpath="//a[@class='shopping_cart_link']")
 WebElement cart;
 @FindBy(id ="checkout")
 WebElement checkout;
 @FindBy(id = "first-name")
 WebElement fname;
 @FindBy(id="last-name")
 WebElement lname;
 @FindBy(id ="postal-code")
 WebElement code;
 @FindBy(id="continue")
 WebElement continues;
 @FindBy(name ="finish")
 WebElement finished;
 @FindBy(id = "back-to-products")
 WebElement backbutton;
 
 public void cart() throws InterruptedException {
	 cart.click();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(checkout));
	    
	 checkout.click();
 }
 public void checkout(String firstname, String lastname, String codes) {
	 fname.sendKeys(firstname);
	 lname.sendKeys(lastname);
	 code.sendKeys(codes);
	 continues.click();
	 System.out.println("✅ Successfully added address");
	
 }
 public void finishbutton() {
	 finished.click();
	 backbutton.click();
 }

}
