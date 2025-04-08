package swag.lab;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import screens.Cart;
import screens.Home;
import screens.LoginScreen;
import screens.WindowChange;


public class BrowserSetup {
	protected WebDriver driver;
	
	@BeforeSuite
	public void loginurl() {
System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe"); 
driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
@Test(priority =1)
 void loginweb() {
	LoginScreen login = new LoginScreen(driver);
	login.name("standard_user");
	login.password("secret_sauce");
	login.loginbutton(null);
	String originalUrl = "Swag Labs";
	String openedUrl = driver.getTitle();
	Assert.assertEquals(originalUrl, openedUrl);
	System.out.println("✅ Title matched successfully: " + originalUrl);
}
@Test(priority=2)
void additems() throws InterruptedException {
	Home homes = new Home(driver);
	homes.item1();
	homes.item2();
	homes.scrolldown();
}
@Test(priority=3)
void cartt() throws InterruptedException {
Cart option = new Cart(driver);
option.cart();
option.checkout("Software", "Tester", "635689");
option.finishbutton();
}

@Test(priority=4)
void about() throws InterruptedException {
	WindowChange wc = new WindowChange(driver);
	wc.sidebutton();
	wc.newWindow();
	Thread.sleep(2000);
	
}



}

