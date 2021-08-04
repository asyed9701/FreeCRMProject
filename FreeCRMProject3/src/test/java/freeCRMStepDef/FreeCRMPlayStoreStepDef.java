package freeCRMStepDef;

import org.testng.Assert;

import freeCRM.utilities.DriverSetUp;
import freeCRMPageActions.FreeCRMPlaystorePageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMPlayStoreStepDef {
	FreeCRMPlaystorePageActions freeCRMPlaystorePageAction = new FreeCRMPlaystorePageActions();
	
	@Given("customer is in freecrm homepage")
	public void customer_is_in_freecrm_homepage() {
		freeCRMPlaystorePageAction.getfreeCRMPlaystore();
	}

	@When("customer  clicks on google play store icon")
	public void customer_clicks_on_google_play_store_icon() {
	   freeCRMPlaystorePageAction.clickPlaystore();
	}

	@Then("customer should be able to see the freecrm google play store page")
	public void customer_should_be_able_to_see_the_freecrm_google_play_store_page(String string) {
		String expectedURL = "https://play.google.com/store/apps/details?id=com.cogmento.app";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}


}
