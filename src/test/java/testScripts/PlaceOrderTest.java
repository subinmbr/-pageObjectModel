package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductlistPages;

public class PlaceOrderTest {
	WebDriver driver;
	LoginPage loginPage;
	ProductlistPages productlistpages;
	CartPage cartpage;
	
	
	
	public PlaceOrderTest() {
		TestBase.initDriver();
		driver= TestBase.getDriver();
		loginPage = new LoginPage(driver);
	}
  @BeforeTest
  public void setup() {
	  
	TestBase.openUrl("https://www.saucedemo.com/");
	loginPage.loginIntoApp("standard_user", "secret_sauce");
	  
	  
  }
 
 
  @Test
 
  public void addTCart()  {
	  
	  productlistpages.addtoCart();
	 
	  productlistpages.viewCart();  
	  Assert.assertTrue(cartpage.isItemAdded());
	  cartpage.checkoutItems();
	
	  
	  }
  
  
  
  
  //@AfterTest
  
  //public void tearDown() {
	  
	  //driver.quit();
  //}
  
  
}
