package base;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import dataProviderFactory.dataProvider;

public class baseClass {

	public WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void StartBrowser(String browser) throws FileNotFoundException, IOException
	{
		if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./src/main/resources/drivers/msedgedriver.exe"); 
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.get(dataProvider.getConfig().getUrl());
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeSession() {

		System.out.println("LOG INFO: Closing browser session");

		//driver.quit();

		System.out.println("LOG INFO: Browser session closed");

	}

}
