package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import base.utilities;

public class HomePage extends utilities {

	WebDriver driver;

	public HomePage(WebDriver d) {
		this.driver = d;
	}

	// Top Bar Navigations
	@FindBy(xpath = "/html/body/div[2]/div[1]/nav/a[1]")
	WebElement Home;
	@FindBy(xpath = "/html/body/div[2]/div[1]/nav/a[2]")
	WebElement Providers;
	@FindBy(xpath = "/html/body/div[2]/div[1]/nav/a[3]")
	WebElement Patients;
	@FindBy(xpath = "/html/body/div[2]/div[1]/nav/a[4]")
	WebElement Platform;
	@FindBy(xpath = "//*[@id=\"w-dropdown-toggle-0\"]/div[2]")
	WebElement Resources;
	@FindBy(xpath = "//body/div[2]/div[1]/nav[1]/div[1]/nav[1]/a[1]")
	WebElement Blog;
	@FindBy(xpath = "//body/div[2]/div[1]/nav[1]/div[1]/nav[1]/a[2]")
	WebElement AboutHarmonize;
	@FindBy(xpath = "//a[contains(text(),'Contact us')]")
	WebElement ContactUs;

	// Request Demo
	@FindBy(xpath = "//h1[contains(text(),'Together, in harmony')]")
	WebElement TogetherHarmony;
	@FindBy(xpath = "//header[1]/div[1]/div[1]/a[1]")
	WebElement RequestDemo;
	

	public String getHomeText() {
		return waitForWebElement(driver, this.Home).getText();
	}

	public void clickHome() {
		waitForWebElement(driver, this.Home).click();
	}

	public String getProvidersText() {
		return waitForWebElement(driver, this.Providers).getText();
	}

	public void clickProviders() {
		waitForWebElement(driver, this.Providers).click();
	}

	public String getPatientsText() {
		return waitForWebElement(driver, this.Patients).getText();
	}

	public void clickPatients() {
		waitForWebElement(driver, this.Patients).click();
	}

	public String getPlatformText() {
		return waitForWebElement(driver, this.Platform).getText();
	}

	public void clickPlatform() {
		waitForWebElement(driver, this.Platform).click();
	}

	public String getResourcesText() {
		return waitForWebElement(driver, this.Resources).getText();
	}

	public void clickResources() {
		waitForWebElement(driver, this.Resources).click();
	}

	public String getBlogText() {
		return waitForWebElement(driver, this.Blog).getText();
	}

	public void clickBlog() {
		waitForWebElement(driver, this.Blog).click();
	}

	public String getAboutHarmonizeText() {
		return waitForWebElement(driver, this.AboutHarmonize).getText();
	}

	public void clickAboutHarmonize() {
		waitForWebElement(driver, this.AboutHarmonize).click();
	}

	public String getContactUsText() {
		return waitForWebElement(driver, this.ContactUs).getText();
	}

	public void clickContactUs() {
		waitForWebElement(driver, this.ContactUs).click();
	}

	public String getRequestDemoText() {
		return waitForWebElement(driver, this.RequestDemo).getText();
	}

	public void clickRequestDemo() {
		waitForWebElement(driver, this.RequestDemo).click();
	}
	
	public String getTogetherHarmonyText() {
		return waitForWebElement(driver, this.TogetherHarmony).getText();
	}

}
