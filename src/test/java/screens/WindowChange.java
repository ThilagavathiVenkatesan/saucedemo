package screens;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowChange extends BaseClass {
public WindowChange(WebDriver driver){
	super(driver);
	 PageFactory.initElements(driver, this);
}
@FindBy(id ="react-burger-menu-btn")
WebElement Sideoption;
@FindBy(id ="about_sidebar_link")
WebElement about;
@FindBy(id="logout_sidebar_link")
WebElement logout;

public void sidebutton() {
	Sideoption.click();
	
}
public void newWindow() throws InterruptedException {
	String originalwindow = driver.getWindowHandle();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.open(arguments[0])", about.getAttribute("href"));
	//about.click();
	Thread.sleep(2000); 
	
	for(String window:driver.getWindowHandles()) {
		if(!window.equals(originalwindow)) {
			driver.switchTo().window(window);
			System.out.println("New window title: " + driver.getTitle());
		
			break;
		}
	}
	
	
	   driver.close();
		driver.switchTo().window(originalwindow);
		Thread.sleep(1000);
		System.out.println("Successfully comes to original window");
		logout.click();
		driver.quit();
	   
}
 


}
