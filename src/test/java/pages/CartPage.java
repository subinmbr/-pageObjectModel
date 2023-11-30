package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(css="div.cart-item")
	WebElement cartList;
	
	
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement removeBtn;
	
	@FindBy(id="continue-shopping")
	WebElement continueShopping;
	
	@FindBy(css="button[name='checkout']")
	WebElement checkOut;
	
	
	
	
	
	//verifiy element is added

public CartPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}


public boolean isItemAdded() {
	
	return cartList.isDisplayed();
	
			
}
	
public void checkoutItems() {
	
	
	
	checkOut.click();
}
	
	
	
	

}
