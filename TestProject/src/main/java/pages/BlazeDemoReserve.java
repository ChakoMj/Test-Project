package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class BlazeDemoReserve extends ProjectSpecificMethods{
	public BlazeDemoReserve(ChromeDriver driver) {
		this.driver = driver;
	}
	public BlazeDemoReserve verifyFlight() {	
		String flight = driver.findElementByXPath("(//div[@class='container'])[2]/h3").getText();
		String flightselected = "Flights from Boston to London:" ;
		if (flight.equals(flightselected)) {
			System.out.println("Pass " +flight+ " Selected");	
		} 
		else 
			System.out.println("Fail " +flightselected+ " not Selected");
		return this;
	}

	public BlazeDemoPurchase chooseecoflight() {	
		List<WebElement> table = driver.findElementsByXPath("//table[@class='table']/tbody[1]/tr[1]/td[6]"); 
		for (WebElement table1 : table) {
			String text = table1.getText().replace("$", "");
			driver.findElementByXPath("//input[@type='submit']").click();
			System.out.println("Flight with $"+text + " choosed to book");
		}
		return new BlazeDemoPurchase(driver);
	}
}