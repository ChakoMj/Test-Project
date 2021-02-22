package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.BlazeDemo;


public class Tc01_FlightBook extends ProjectSpecificMethods{
	@Test
	public void FlightBooking()  {

		new BlazeDemo(driver)
		.depcity("Boston") //"Paris", "Philadelphia", "Boston", "Portland", "San Diego" ,"Mexico City","São Paolo"
		.tocity("London") //"Buenos Aires", "Rome", "London", "Berlin", "New York" ,"Dublin" ,"Cairo"
		.FindFlight()
		.verifyFlight()
		.chooseecoflight()
		.Name("Bill gates")
		.address("123 Microsoft st")
		.city("Google city")
		.code("123456")
		.cardtype("Visa") // "Visa","American Express" , "Diner's Club"
		.cardNumber("1234567891234")
		.cardMonth("12")
		.cardyear("2021")
		.NameOncard("Daily softwares")
		.PurchaseFlight()
		.VerifyFlightBooking()
		.VerifyFlightID();




	}
}

