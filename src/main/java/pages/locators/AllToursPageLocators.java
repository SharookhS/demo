package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllToursPageLocators {
	
	@FindBy(how = How.XPATH,using = "//*[@id='contentHeader']/h1")
	public WebElement toursMenuTab;

}
