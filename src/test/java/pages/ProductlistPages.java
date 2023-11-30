package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductlistPages {
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement itemOne;
	
	@FindBy(className="shopping_cart_link")
	WebElement cartIcon;
	

	public ProductlistPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void addtoCart() {
		itemOne.click();
		
	}
	
	
	public void viewCart() {
		cartIcon.click();
		
	}

}
