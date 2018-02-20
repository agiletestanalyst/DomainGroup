package steps;


import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.DomainHomePageActions;
import utils.SeleniumDriver;

public class PageLoadTestSteps {
	
	
	DomainHomePageActions domainHomePageActions = new DomainHomePageActions();
	String expectedPageTitle = null;
	String ActualPageTitle = null;
	String pageLoadStatus = null;
	JavascriptExecutor js = null;
	Properties properties = System.getProperties();
	SoftAssert softAssertion;
	
	@Given("^I navigate to the Home Page \"([^\"]*)\" of real estate website$")
	public void i_navigate_to_the_Home_Page_of_real_estate_website(String url)  {
		SeleniumDriver.openPage(url);
	}

	
	@When("^I click on Rent link$")
	public void i_click_on_Rent_link()  {
		domainHomePageActions.clickOnRentTab();    
	}

	
	@Then("^Page loads successfully showing the rentPageTitle$")
	public void Page_loads_successfully_showing_the_rentPageTitle() throws Throwable {
		properties.load(new FileInputStream(".\\src\\test\\resources\\config.properties"));
		expectedPageTitle = properties.getProperty("rentPageTitle");
		ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		softAssertion = new SoftAssert();
		// Check 1 - soft check , checking the title of page
		softAssertion.assertEquals(ActualPageTitle, expectedPageTitle, "Page Failed to Load Successfully.");
	}
	
	@Then("^The DOM loads successfully showing status as completed$")
	public void the_DOM_loads_successfully_showing_status_as_completed() {
		// Check 2 - one more check to verify if the DOM loading is complete or not
		pageLoadStatus = getDOMLoadStatus();
	    softAssertion.assertEquals(pageLoadStatus, "complete", "Page Failed to Load DOM Successfully."); 
		softAssertion.assertAll();
	}


	@When("^I click on Buy link$")
	public void i_click_on_Buy_link() {
		domainHomePageActions.clickOnBuyTab();  
	}


	@Then("^Page loads successfully showing the buyPageTitle$")
	public void Page_loads_successfully_showing_the_buyPageTitle() throws Throwable {
		properties.load(new FileInputStream(".\\src\\test\\resources\\config.properties"));
		expectedPageTitle = properties.getProperty("buyPageTitle");
		ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		softAssertion = new SoftAssert();
		// Check 1 - soft check , checking the title of page
		softAssertion.assertEquals(ActualPageTitle, expectedPageTitle, "Buy Page Failed to Load Successfully.");
	}
	
	@When("^I click on New homes link$")
	public void i_click_on_New_homes_link()  {
		domainHomePageActions.clickOnNewhomesTab();
	}

	@Then("^Page loads successfully showing the NewHomesPageTitle$")
	public void Page_loads_successfully_showing_the_NewHomesPageTitle() throws Throwable {
		properties.load(new FileInputStream(".\\src\\test\\resources\\config.properties"));
		expectedPageTitle = properties.getProperty("NewHomesPageTitle");
		ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		softAssertion = new SoftAssert();
		// Check 1 - soft check , checking the title of page
		softAssertion.assertEquals(ActualPageTitle, expectedPageTitle, "New Homes Page Failed to Load Successfully.");
	}
	
	@When("^I click on Sold link$")
	public void i_click_on_Sold_link() throws Throwable {
		domainHomePageActions.clickOnSoldTab();
	}

	@Then("^Page loads successfully showing the SoldPageTitle$")
	public void page_loads_successfully_showing_the_SoldPageTitle() throws Throwable {
		properties.load(new FileInputStream(".\\src\\test\\resources\\config.properties"));
		expectedPageTitle = properties.getProperty("SoldPageTitle");
		ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		softAssertion = new SoftAssert();
		// Check 1 - soft check , checking the title of page
		softAssertion.assertEquals(ActualPageTitle, expectedPageTitle, "Sold Home Page Failed to Load Successfully.");
	}

	@When("^I click on Commercial link$")
	public void i_click_on_Commercial_link() throws Throwable {
		domainHomePageActions.clickOnCommercialTab();
	}

	@Then("^Page loads successfully showing the CommercialPageTitle$")
	public void page_loads_successfully_showing_the_CommercialPageTitle() throws Throwable {
		properties.load(new FileInputStream(".\\src\\test\\resources\\config.properties"));
		expectedPageTitle = properties.getProperty("CommercialPageTitle");
		ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		softAssertion = new SoftAssert();
		// Check 1 - soft check , checking the title of page
		softAssertion.assertEquals(ActualPageTitle, expectedPageTitle, "Commercial Properties Page Failed to Load Successfully.");
	}

	@When("^I click on Sell link$")
	public void i_click_on_Sell_link() throws Throwable {
		domainHomePageActions.clickOnSellTab();
	}

	@Then("^Page loads successfully showing the SellPageTitle$")
	public void page_loads_successfully_showing_the_SellPageTitle() throws Throwable {
		properties.load(new FileInputStream(".\\src\\test\\resources\\config.properties"));
		expectedPageTitle = properties.getProperty("SellPageTitle");
		ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		softAssertion = new SoftAssert();
		// Check 1 - soft check , checking the title of page
		softAssertion.assertEquals(ActualPageTitle, expectedPageTitle, "Sell Page Failed to Load Successfully.");
	}

	@When("^I click on News link$")
	public void i_click_on_News_link() throws Throwable {
		domainHomePageActions.clickOnNewsTab();
	}

	@Then("^Page loads successfully showing the MoneynMarketsPageTitle$")
	public void page_loads_successfully_showing_the_MoneynMarketsPageTitle() throws Throwable {
		properties.load(new FileInputStream(".\\src\\test\\resources\\config.properties"));
		expectedPageTitle = properties.getProperty("MoneynMarketsPageTitle");
		ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		softAssertion = new SoftAssert();
		// Check 1 - soft check , checking the title of page
		softAssertion.assertEquals(ActualPageTitle, expectedPageTitle, "News Page Failed to Load Successfully.");
	}

	@When("^I click on Agents link$")
	public void i_click_on_Agents_link() throws Throwable {
		domainHomePageActions.clickOnAgentsTab();
	}

	@Then("^Page loads successfully showing the AgentsPageTitle$")
	public void page_loads_successfully_showing_the_AgentsPageTitle() throws Throwable {
		properties.load(new FileInputStream(".\\src\\test\\resources\\config.properties"));
		expectedPageTitle = properties.getProperty("AgentsPageTitle");
		ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		softAssertion = new SoftAssert();
		// Check 1 - soft check , checking the title of page
		softAssertion.assertEquals(ActualPageTitle, expectedPageTitle, "Agents Page Failed to Load Successfully.");
	}

	@When("^I click on More-Share link$")
	public void i_click_on_More_Share_link() throws Throwable {
		domainHomePageActions.clickOnMoreShareTab();
	}

	@Then("^Page loads successfully showing the MoreSharePageTitle$")
	public void page_loads_successfully_showing_the_MoreSharePageTitle() throws Throwable {
		properties.load(new FileInputStream(".\\src\\test\\resources\\config.properties"));
		expectedPageTitle = properties.getProperty("MoreSharePageTitle");
		ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		softAssertion = new SoftAssert();
		// Check 1 - soft check , checking the title of page
		softAssertion.assertEquals(ActualPageTitle, expectedPageTitle, "Share Page Failed to Load Successfully.");
	}
	
	public String getDOMLoadStatus(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		js = (JavascriptExecutor) SeleniumDriver.getDriver();
	    pageLoadStatus = (String)js.executeScript("return document.readyState");
		return pageLoadStatus;
	}
}
