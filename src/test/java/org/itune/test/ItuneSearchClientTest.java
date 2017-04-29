package org.itune.test;

import org.itune.ItuneSearchClient;
import org.itune.model.ItuneSearchResponse;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Geetha Gowda
 * @date 04/29/2017
 **/
public class ItuneSearchClientTest {

	@Test(dataProvider = "APITestDataNegative")
	public void testAllParameters(String queryparam) {
		ItuneSearchResponse response = new ItuneSearchClient().search(queryparam);
		Assert.assertNotNull(response);
		Assert.assertFalse(response.getResultCount() == 0);
		Assert.assertFalse(response.getResults().isEmpty());
	}

	@Test(dataProvider = "APITestDataPositive")
	public void testCountryOnly(String queryparam ) {
		ItuneSearchResponse response = new ItuneSearchClient().search(queryparam);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getResultCount() == 0);
		Assert.assertTrue(response.getResults().isEmpty());
	}

	@DataProvider(name = "APITestDataPositive")
	public Object[][] apiDataPositive() {
		return new Object[][] { { "country=GB" }, { "" }, };
	}

	@DataProvider(name = "APITestDataNegative")
	public Object[][] apiDataNegative() {
		return new Object[][] { { "term=Jack&country=GB&media=movie&limit=1" }, { "term=Jack" }, };
	}

}