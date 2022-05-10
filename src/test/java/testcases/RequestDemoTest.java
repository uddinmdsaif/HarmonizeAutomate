package testcases;

import org.testng.annotations.Test;

import base.baseClass;
import pages.HomePage;
import pages.RequestDemoPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;


public class RequestDemoTest extends baseClass {

	HomePage hPage;
	RequestDemoPage rdPage;

	@BeforeClass
	public void beforeTest() {
		hPage = PageFactory.initElements(driver, HomePage.class);
		rdPage = PageFactory.initElements(driver, RequestDemoPage.class);
	}

	@Test
	public void validateRequestDemo() {
		String expectedTogetherHarmonyMessage = "Together, in harmony";
		String actualTogetherHarmonyMessage = hPage.getTogetherHarmonyText();
		assertEquals(actualTogetherHarmonyMessage, expectedTogetherHarmonyMessage);
		
		hPage.clickHome();
		hPage.clickRequestDemo();
		rdPage.enterName();
		rdPage.enterEmailAddress();
		rdPage.enterMessage();
		rdPage.clickSubmit();

		/*
		 * String expectedThankYouMessage = "Thank you! Your message has been received."; 
		 * String actualThankYouMessage = rdPage.getThankYouMessage(); 
		 * assertEquals(actualThankYouMessage, expectedThankYouMessage);
		 */
		
		Alert alert = driver.switchTo().alert();
		String expectedAlertMessage = "Please confirm you’re not a robot.";
		String actualAlertMessage = alert.getText();
		assertEquals(actualAlertMessage, expectedAlertMessage);
		//alert.accept();

	}

}
