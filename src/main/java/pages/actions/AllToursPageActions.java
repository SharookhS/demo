package pages.actions;

import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import pages.locators.AllToursPageLocators;

public class AllToursPageActions {
	
	
	AllToursPageLocators allToursPageLocators = null;
	public AllToursPageActions()
	{
		this.allToursPageLocators = new AllToursPageLocators();
		PageFactory.initElements(DriverFactory.getDriver(), allToursPageLocators);
	}
	
	public String allToursPageHeaderText()
	{
		return allToursPageLocators.toursMenuTab.getText();
	}

}
