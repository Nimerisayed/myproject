package myproject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MyFirstTestCase {
	
	WebDriver driver = new ChromeDriver();
	//WebDriver driver2 = new EdgeDriver();
	//WebDriver driver3 = new FirefoxDriver();

	
	@BeforeTest
	public void mySetup() {
		driver.get("https://www.saucedemo.com/");
		//driver2.get("https://www.saucedemo.com/");

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		driver.manage().window().maximize();
		
		List<WebElement> addtoCartButtons = driver.findElements(By.className("btn_primary"));
		List<WebElement> item_name = driver.findElements(By.className("inventory_item_name"));
	    List<WebElement> item_prices = driver.findElements(By.className("inventory_item_prices"));
		for(int i = 0 ;i<addtoCartButtons.size();i++) {
			addtoCartButtons.get(i).click();
			System.out.println(
					item_name.get(i).getText()+"was added and the prices of it is "
					+item_prices.get(i).getText()
					);
		}

		
					

//			for (int i1 = 0; i1 < addtouserNameInTitle.size(); i1++) {
//			    WebElement element = addtouserNameInTitle.get(i1);
//			    System.out.println(element.getText());
//			}
		//	list<WebElement> item_name = driver.findElements(By.className(""));		
		

	}
	
	
	
	@Test()
	public void myFirstTest() {}


	@AfterTest
	public void myPostTesting() {}

	
	
	
	

}
