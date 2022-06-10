package com.amfam.qa.test.car;

import org.testng.annotations.Test;

import base.BaseClass;

public class CarTest extends BaseClass {

	@Test
	public void carTest() {
		landingPage.landingPageSteps(allActions);
		zipCodePage1.zipCodePage1Steps(allActions, "11416");
		getQuatoPage.getQuatoPageSteps(allActions);
		zipCodePage2.zipCodePage2Steps(allActions, "11416", "A");
		policyholderDetails.policyholderDetailsPageSteps(allActions, "Mohammad", 'J', "Ahmed", "06/03/1991",
				"batman_95@yahoo.com","8434 102nd AVE", "Ozone park","NY", "11416", "2016");
		continuePage.continuePageSteps(allActions);
	}

}
