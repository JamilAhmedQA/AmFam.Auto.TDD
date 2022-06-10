package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import commons.AllActions;

public class ContinuePage {

	public ContinuePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	 @FindBy(id = "Continue")
	 WebElement continuElement;
	String continueLocator = "Continue";//changed for test
	private void clickOnContinue(AllActions allActions) {
		allActions.click("Continue");//changed for test
	}

	/*private void fixEroor(AllActions allActions) {
		boolean isErrorPresent = allActions.isPresent(policyHolder);
		if (isErrorPresent) {
			clickOnContinue(allActions);
		}
	}
*/
	public void continuePageSteps(AllActions allActions) {
		clickOnContinue(allActions);
		//fixEroor(allActions);
	}

}
