package freeCRMStepDef;

import org.testng.Assert;

import freeCRM.utilities.DriverSetUp;
import freeCRMPageActions.FreeCRMCompareActionsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMCompareStepDef {
	FreeCRMCompareActionsPage freeCRMCompareActionsPage = new FreeCRMCompareActionsPage();
	
	@Given("customer is in freecrm homepage")
	public void customer_is_in_freecrm_homepage() {
		freeCRMCompareActionsPage.getFreeCRMComparePage();
	}

	@When("customer  clicks compare icon")
	public void customer_clicks_compare_icon() {
		freeCRMCompareActionsPage.clickCompare();
	}

	@Then("customer should be able to see the freecrm compare page")
	public void customer_should_be_able_to_see_the_freecrm_compare_page(String string) {
		String expectedURL = "https://freecrm.com/compare.html";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	
}
