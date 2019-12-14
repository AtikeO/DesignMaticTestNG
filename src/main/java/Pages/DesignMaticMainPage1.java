package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;

public class DesignMaticMainPage1 extends BasePage{
	WebDriver driver;
	ElementUtil elementUtil;
	
	static By login = By.className("login-link");

	
    public DesignMaticMainPage1(WebDriver driver) {
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
    
    
    
    public String getHomePageTitle(){
		return elementUtil.waitForGetPageTitle(Constants.HOME_PAGE_TITLE);
		
		
	}
    public void clickOnlogin(){
   	 elementUtil.doClick(login);
   	 
    }

}
