package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class BlazeDemoConfirmation extends ProjectSpecificMethods{
	public BlazeDemoConfirmation(ChromeDriver driver) {
		this.driver = driver;
}
	public BlazeDemoConfirmation VerifyFlightBooking() {	
		String Confirmation =  driver.findElementByXPath("//div[@class='container hero-unit']/h1").getText();
		String Confirmation1 = "Thank you for your purchase today!";  
		if (Confirmation.equals(Confirmation1)) {
			System.out.println("Tickets booked successfully");
		}else 
			System.out.println("Tickets not booked ");
		return this;
}
	public BlazeDemoConfirmation VerifyFlightID() {	
		System.out.println("Confirmation id: " + driver.findElementByXPath("//td[text()='Id']/following-sibling::td").getText() );
		return this;
}
}