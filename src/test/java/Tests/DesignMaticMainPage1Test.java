package Tests;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePage.BasePage;
import Pages.DesignMaticMainPage1;
import Utilities.Constants;

public class DesignMaticMainPage1Test {
	
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	DesignMaticMainPage1 designmatic;

	@BeforeMethod
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.initialize_properties();
		driver = basePage.initialize_driver(prop);
		designmatic = new DesignMaticMainPage1(driver);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getTitle() {
		String title = designmatic.getHomePageTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);
	}

	@Test
	public void clickLoginButton() {
		designmatic.clickOnlogin();

	}

}
