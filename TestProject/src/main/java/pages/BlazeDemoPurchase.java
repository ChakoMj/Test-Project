package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethods;

public class BlazeDemoPurchase extends ProjectSpecificMethods{
	public BlazeDemoPurchase(ChromeDriver driver) {
		this.driver = driver;
	}
	public BlazeDemoPurchase Name(String fName) {	
		driver.findElementById("inputName").sendKeys(fName);
		return this;
	}

	public BlazeDemoPurchase address(String add) {	
		driver.findElementById("address").sendKeys(add);
		return this;
	}
	
	public BlazeDemoPurchase city(String cty) {	
		driver.findElementById("city").sendKeys(cty);
		return this;
	}

	public BlazeDemoPurchase code(String cde) {	
		driver.findElementById("zipCode").sendKeys(cde);
		return this;
	}

	public BlazeDemoPurchase cardtype(String ctype) {	
		WebElement source = driver.findElementById("cardType");
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText(ctype);
		
		return this;
	}
	public BlazeDemoPurchase cardNumber(String ccnumber) {	
		driver.findElementById("creditCardNumber").sendKeys(ccnumber);
		
		return this;
	}
	
	public BlazeDemoPurchase cardMonth(String ccMonth) {	
		driver.findElementById("creditCardMonth").sendKeys(Keys.LEFT_SHIFT, Keys.CONTROL, Keys.ARROW_LEFT);
		driver.findElementById("creditCardMonth").sendKeys(ccMonth);
		return this;
	}
	public BlazeDemoPurchase cardyear(String ccyear) {	
		driver.findElementById("creditCardYear").sendKeys(Keys.LEFT_SHIFT, Keys.CONTROL, Keys.ARROW_LEFT);
		driver.findElementById("creditCardYear").sendKeys(ccyear);
		return this;
	}
	public BlazeDemoPurchase NameOncard(String NameCard) {	
		driver.findElementById("nameOnCard").sendKeys(NameCard);
		return this;
	}
	public BlazeDemoConfirmation PurchaseFlight() {	
		driver.findElementByXPath("//input[@value='Purchase Flight']").click();
		return new BlazeDemoConfirmation(driver);

}
}