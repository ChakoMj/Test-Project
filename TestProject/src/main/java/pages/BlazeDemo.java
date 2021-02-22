package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethods;

public class BlazeDemo extends ProjectSpecificMethods {
	public BlazeDemo(ChromeDriver driver) {
		this.driver = driver;
	}

	public BlazeDemo depcity(String fromcity) {
		WebElement source = driver.findElementByName("fromPort");
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText(fromcity);
		return this;

	}

	public BlazeDemo tocity(String landincity) {
		WebElement source = driver.findElementByName("toPort");
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText(landincity);
		return this;

	}

	public BlazeDemoReserve FindFlight() {
	driver.findElementByXPath("//input[@type='submit']").click();
		return new BlazeDemoReserve(driver);
}
}