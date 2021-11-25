package parallel;


import org.apache.log4j.Logger;
import org.testng.Assert;


import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.actions.AllToursPageActions;
import pages.actions.HomePageActions;
import utils.LoggerHelper;

public class AllToursSteps {
	
	HomePageActions homePageActions = new HomePageActions();
	AllToursPageActions allToursPageActions = new AllToursPageActions();
	

	
	 
	@Given("url {string}")
	public void url(String url) {
		
		DriverFactory.getDriver().get(url);
	}

	@When("I click on All Tours menu link")
	public void i_click_on_all_tours_menu_link() throws InterruptedException {
		homePageActions.clickAllToursSubMenuButton();
	}

	@Then("All tours page displays with {string} header")
	public void all_tours_page_displays_with_header(String headerName) {
	    String Actualresult = allToursPageActions.allToursPageHeaderText();
	    System.out.println("Actual Result :"+Actualresult);
	    Assert.assertEquals(Actualresult, headerName);
	}

}
