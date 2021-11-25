package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	
	@FindBy(how = How.XPATH,using = "//*[@id='siteNav']/ul/li[1]/a")
	public WebElement toursMenuTab;
	
	@FindBy(how = How.XPATH,using = "//*[@id='siteNav']/ul/li[1]/ul/li[1]/a")
	public WebElement allToursSubMenuTab;

}
