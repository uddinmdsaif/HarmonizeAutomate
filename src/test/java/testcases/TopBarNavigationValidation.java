package testcases;

import org.testng.annotations.Test;
import base.baseClass;
import pages.HomePage;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.support.PageFactory;

public class TopBarNavigationValidation extends baseClass {
	
	HomePage hPage;
	
	@BeforeClass
	public void beforeTest() {
		hPage = PageFactory.initElements(driver, HomePage.class); 
	}
	
	@Test(priority=0)
	public void HomeBarValidation() {
		String expectedHomeBarName = "Home";
		String actualHomeBarName = hPage.getHomeText();
		assertEquals(actualHomeBarName, expectedHomeBarName);
	}
	
	@Test(priority=1)
	public void HomeBarNavigation() {
		hPage.clickHome();
		String expectedHomeUrl = "https://www.harmonize.health/";
		String actualHomeUrl = driver.getCurrentUrl();
		assertEquals(actualHomeUrl, expectedHomeUrl);
	}
	
	@Test(priority=2)
	public void ProvidersBarsValidation() {
		String expectedProvidersBarName = "Providers";
		String actualProvidersBarName = hPage.getProvidersText();
		assertEquals(actualProvidersBarName, expectedProvidersBarName);
	}
	
	@Test(priority=3)
	public void ProvidersBarsNavigation() {
		hPage.clickProviders();
		String expectedProvidersUrl = "https://www.harmonize.health/providers";
		String actualProvidersUrl = driver.getCurrentUrl();
		assertEquals(actualProvidersUrl, expectedProvidersUrl);
	}
	
	@Test (priority=4)
	public void PatientsBarValidation() {
		String expectedPatientsBarName = "Patients";
		String actualPatientsBarName = hPage.getPatientsText();
		assertEquals(actualPatientsBarName, expectedPatientsBarName);
	}

	@Test (priority=5)
	public void PatientsUrlNavigation() {
		hPage.clickPatients();
		String expectedPatientsUrl = "https://www.harmonize.health/patients"; 
		String actualPatientsUrl = driver.getCurrentUrl();
		assertEquals(actualPatientsUrl, expectedPatientsUrl);
	}
	
	@Test (priority=6)
	public void PlatformBarValidation() {
		String expectedPlatformBarName = "Platform";
		String actualPlatfromBarName = hPage.getPlatformText();
		assertEquals(actualPlatfromBarName, expectedPlatformBarName);
	}
	
	@Test (priority=7)
	public void PlatformUrlNavigation() {
		hPage.clickPlatform();
		String expectedPlatformUrl = "https://www.harmonize.health/platform"; 
		String actualPlatformUrl = driver.getCurrentUrl();
		assertEquals(actualPlatformUrl, expectedPlatformUrl);
	}
	
	@Test (priority=8)
	public void ResourcesBarValidation() {
		String expectedResourcesBarName = "Resources";
		String actualResourcesBarName = hPage.getResourcesText();
		assertEquals(actualResourcesBarName, expectedResourcesBarName);
	}
	
	@Test (dependsOnMethods={"ResourcesBarValidation"})
	public void BlogUrlNavigation() {
		hPage.clickResources();
		hPage.clickBlog();
		String expectedBlogUrl = "https://www.harmonize.health/blog"; 
		String actualBlogUrl = driver.getCurrentUrl();
		assertEquals(actualBlogUrl, expectedBlogUrl);
	}
	
	@Test (dependsOnMethods={"ResourcesBarValidation"})
	public void AboutHarmonizeUrlNavigation() {
		hPage.clickResources();
		hPage.clickAboutHarmonize();
		String expectedAboutHarmonizeUrl = "https://www.harmonize.health/about"; 
		String actualAboutHarmonizeUrl = driver.getCurrentUrl();
		assertEquals(actualAboutHarmonizeUrl, expectedAboutHarmonizeUrl);
	}
	
	@Test (priority=9)
	public void ContactUsBarValidation() {
		String expectedContactUsBarName = "Contact us";
		String actualContactUsBarName = hPage.getContactUsText();
		assertEquals(actualContactUsBarName, expectedContactUsBarName);
	}
	
	@Test (priority=10)
	public void ContactUsUrlNavigation() {
		hPage.clickContactUs();
		String expectedContactUsUrl = "https://www.harmonize.health/contact-us"; 
		String actualContactUsUrl = driver.getCurrentUrl();
		assertEquals(actualContactUsUrl, expectedContactUsUrl);
	}
	
}
