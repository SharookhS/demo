package pages.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import pages.locators.HomePageLocators;
import utils.LoggerHelper;

public class HomePageActions {
	
	WebDriver driver = DriverFactory.getDriver();
	
	HomePageLocators homePageLocators = null;
	public HomePageActions()
	{
		
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(DriverFactory.getDriver(), homePageLocators);
		
	}
	
	public AllToursPageActions clickAllToursSubMenuButton() throws InterruptedException
	{
//		Actions action = new Actions(DriverFactory.getDriver());
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(homePageLocators.toursMenuTab).build().perform();
		
		Thread.sleep(2000);
		
		homePageLocators.toursMenuTab.click();
		
		return new AllToursPageActions();
		
	}

}
