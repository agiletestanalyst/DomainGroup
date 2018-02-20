package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DomainHomePageLocators {
	
	
	@FindBy(how=How.LINK_TEXT,using="Buy")
	public WebElement propToBuyLink;
	
	@FindBy(how=How.LINK_TEXT,using="Rent")
	public WebElement propToRentLink;
	
	@FindBy(how=How.LINK_TEXT,using="New homes")
	public WebElement newHomesLink;
	
	@FindBy(how=How.LINK_TEXT,using="Sold")
	public WebElement propSoldLink;
	
	@FindBy(how=How.LINK_TEXT,using="Commercial")
	public WebElement commercialLink;

	@FindBy(how=How.LINK_TEXT,using="Sell")
	public WebElement propToSellLink;

	@FindBy(how=How.LINK_TEXT,using="News")
	public WebElement newsLink;

	@FindBy(how=How.LINK_TEXT,using="Money & Markets")
	public WebElement MoneynMarketsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Agents")
	public WebElement agentsLink;
	
	@FindBy(how=How.LINK_TEXT,using="More")
	public WebElement moreLink;
	
	@FindBy(how=How.LINK_TEXT,using="Share")
	public WebElement ShareLink;
	
}
