package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commons.AllActions;

public class LandingPage {
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[@class='LeadRouting__select a'])[1]")
	WebElement carElement;
	
	private void clickCar(AllActions allActions) {
		allActions.click(carElement);
	}
	
	public void landingPageSteps(AllActions allActions) {
		clickCar(allActions);
	}

}
