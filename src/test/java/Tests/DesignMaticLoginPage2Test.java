package Tests;

	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import BasePage.BasePage;
	import Pages.DesignMaticLoginPage2;
	import Pages.DesignMaticMainPage1;
	import Utilities.Constants;

	
		public class DesignMaticLoginPage2Test {
	
			WebDriver driver;
			Properties prop;
			BasePage basePage;
			DesignMaticMainPage1 designmatic;
			DesignMaticLoginPage2 designmaticLogin;
			
			@BeforeMethod
			public void setUp(){
				basePage = new BasePage();
				prop = basePage.initialize_properties();
				driver = basePage.initialize_driver(prop);
				designmatic=new DesignMaticMainPage1(driver);
				designmatic.clickOnlogin();
				designmaticLogin=new DesignMaticLoginPage2(driver);
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			@Test(priority=1)
			public void getLoginPageTitle(){
				String title=designmaticLogin.getLoginPageTitle();
				System.out.println("Page title is: "+title);
				Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);	
			}
				@Test(priority=2)
			public void logoDesignTest(){
					designmaticLogin.logoDesign();
				}
				
				@AfterMethod
				public void tearDown(){
					basePage.closeBrowser();
				}	

	}
	
	
	
	

