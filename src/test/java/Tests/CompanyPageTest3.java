package Tests;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePage.BasePage;
import Pages.CompanyPage3;
import Pages.DesignMaticLoginPage2;
import Pages.DesignMaticMainPage1;

	
	public class CompanyPageTest3 {
		
		WebDriver driver;
		Properties prop;
		BasePage basePage;
		DesignMaticMainPage1 designmatic;
		DesignMaticLoginPage2 designmaticlogo;
		CompanyPage3 company;
		
		@BeforeMethod
		public void setUp(){
			basePage = new BasePage();
			prop = basePage.initialize_properties();
			driver = basePage.initialize_driver(prop);
			designmatic=new DesignMaticMainPage1(driver);
			designmatic.clickOnlogin();
			designmaticlogo=new DesignMaticLoginPage2(driver);
			designmaticlogo.logoDesign();	
			company=new CompanyPage3(driver);
			
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
		
		@Test(priority=1)
		public void companyAndIndustry(){
			company.companyName();
			company.selectYourIndustry();
		}
		
		
		@Test(priority=2)
		public void selectedText(){
		    boolean text = company.elementSelected();
			System.out.println("Selected industry is: "+ text);
		}
		
		

		@AfterMethod
		public void tearDown(){
			basePage.closeBrowser();
		}					
}