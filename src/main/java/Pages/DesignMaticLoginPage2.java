package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;

public class DesignMaticLoginPage2 extends BasePage{

WebDriver driver;
ElementUtil elementUtil;

By email = By.id("username");
By password=By.id("password");
By logoDesign=By.xpath("//span[contains(text(),'Logo Design')]");



 public DesignMaticLoginPage2(WebDriver driver) {
	this.driver =driver;
	elementUtil = new ElementUtil(driver);
}

 public String getLoginPageTitle(){
		return elementUtil.waitForGetPageTitle(Constants.LOGIN_PAGE_TITLE);

}
 public void logoDesign(){
	 elementUtil.doSendKeys(email, "aozgur72@gmail.com");
	 elementUtil.doSendKeys(password, "123456");
	 elementUtil.doClick(logoDesign);
 }	 
	 
 }