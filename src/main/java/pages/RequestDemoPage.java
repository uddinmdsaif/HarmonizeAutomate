package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.utilities;

public class RequestDemoPage extends utilities {

	WebDriver driver;

	public RequestDemoPage(WebDriver d) {
		this.driver = d;
	}

	// Request a Demo

	@FindBy(xpath = "//header[1]/div[1]/div[1]/a[1]/div[1]/div[1]")
	WebElement RequestDemo;
	@FindBy(xpath = "//input[@id='Name-2']")
	WebElement Name;
	@FindBy(xpath = "//input[@id='Email-2']")
	WebElement EmailAddress;
	@FindBy(xpath = "//textarea[@id='Message']")
	WebElement Message;
	@FindBy(xpath = "//header/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[3]")
	WebElement Submit;
	@FindBy(xpath = "//div[contains(text(),'Thank you! Your message has been received.')]")
	WebElement ThankYouMessage;

	public void enterName() {
		waitForWebElement(driver, Name).sendKeys("Test User");
	}

	public void enterEmailAddress() {
		waitForWebElement(driver, EmailAddress).sendKeys("testuser@test.com");
	}
	
	public void enterMessage() {
		waitForWebElement(driver, Message).sendKeys("This is a test message to request a demo!");
	}
	
	public void clickSubmit() {
		waitForWebElement(driver, Submit).click();
	}
	
	public String getThankYouMessage() {
		return waitForWebElement(driver, ThankYouMessage).getText();
	}
	
}
