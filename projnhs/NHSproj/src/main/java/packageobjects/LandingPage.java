package packageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractClass.AbstractClass;

public class LandingPage extends AbstractClass {

	// TODO Auto-generated method stub
	WebDriver driver;
	
	@FindBy(id="nhsuk-cookie-banner__link_accept_analytics")
	WebElement cookies;
	
	public LandingPage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goToNHSWebsite() {
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		WaitforWebElementvisible(cookies);
		cookies.click();
	}
	
	


}
