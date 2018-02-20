package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.DomainHomePageLocators;
import utils.SeleniumDriver;

public class DomainHomePageActions {
	DomainHomePageLocators domainHomePageLocators=null;
	public DomainHomePageActions()
	{
		
		this.domainHomePageLocators=new DomainHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), domainHomePageLocators);
	}
	
	public void clickOnRentTab()
	{
		domainHomePageLocators.propToRentLink.click();
		
	}
	public void clickOnBuyTab()
	{
		domainHomePageLocators.propToBuyLink.click();
		
	}
	public void clickOnNewhomesTab()
	{
		domainHomePageLocators.newHomesLink.click();
		
	}
	public void clickOnSoldTab()
	{
		domainHomePageLocators.propSoldLink.click();
		
	}
	public void clickOnCommercialTab()
	{
		domainHomePageLocators.commercialLink.click();
		
	}
	public void clickOnSellTab()
	{
		domainHomePageLocators.propToSellLink.click();
		
	}
	public void clickOnNewsTab()
	{
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(domainHomePageLocators.newsLink).perform();
		domainHomePageLocators.newsLink.click();
		domainHomePageLocators.MoneynMarketsLink.click();
		
	}
	public void clickOnAgentsTab()
	{
		domainHomePageLocators.agentsLink.click();
		
	}
	public void clickOnMoreShareTab()
	{
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(domainHomePageLocators.moreLink).perform();
		domainHomePageLocators.moreLink.click();	
		domainHomePageLocators.ShareLink.click();
	}

}
