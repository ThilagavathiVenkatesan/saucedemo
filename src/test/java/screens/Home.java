package screens;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home extends BaseClass {
	public Home(WebDriver driver) {
		super(driver);
		 PageFactory.initElements(driver, this);
	
	}
	//locators
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	WebElement item1;
	@FindBy(id ="add-to-cart-sauce-labs-bike-light")
	WebElement item2;
	@FindBy(xpath = "//Select[@class='product_sort_container']")
	WebElement scrolldown;
	
	//add to cart for 3rd item
	public void item1() {
		//scroll to down
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("window.scrollBy(0,500)");
	wait.until(ExpectedConditions.visibilityOf(item1));
	item1.click();
	System.out.println("✅ Item1 added successfully");

}
	// add to cart for left side 1st item
	public void item2() throws InterruptedException {
		Thread.sleep(2000);
		//scroll upward
		JavascriptExecutor je1 = (JavascriptExecutor)driver;
		je1.executeScript("window.scrollBy(0,-500)");
		wait.until(ExpectedConditions.visibilityOf(item2));
		item2.click();
		System.out.println("✅ Item1 added successfully");
	}
	public void scrolldown() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(scrolldown));
		Select dropdown = new Select(scrolldown);
		dropdown.selectByVisibleText("Price (low to high)");
		System.out.println("✅ low to high selected successfully");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Price (high to low)");
		System.out.println("✅ high to low selected successfully");
	}
	
	
	
	
	
	
	
	
	
}