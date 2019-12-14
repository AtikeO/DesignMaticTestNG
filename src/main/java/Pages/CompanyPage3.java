package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePage.BasePage;
import Utilities.ElementUtil;

public class CompanyPage3 extends BasePage {
	WebDriver driver;
	ElementUtil elementUtil;

	By step1 = By.id("company_name");
	By step2 = By.id("//select[@id='details_categories' and @name='details[categories]']"); ///*[name='details[categories]']
	By cleaning = By.xpath("//option[contains(text(),'Cleaning')]");
	
	
	public CompanyPage3(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	public void companyName() {
		elementUtil.doSendKeys(step1, "siliconelabs.com");
	}
	
	
	public void selectYourIndustry() {
		
		elementUtil.waitForElementPresent(step2);
		WebElement industry = driver.findElement(step2);
		Select select = new Select(industry);
		elementUtil.waitForElementPresent(cleaning);
		select.selectByVisibleText("Cleaning");
		
	}
	 
		 public boolean elementSelected(){	
	     return elementUtil.isElementSelected(cleaning);
	}
 
		
//		public String getText(){	
//		return elementUtil.doGetText(cleaning);
//			
//		}
			
	}
	
