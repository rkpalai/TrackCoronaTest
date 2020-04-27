package trackcoronaTests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import trackcoronaCommonLib.Base;
import trackcoronaObjRepo.HomePage;

public class HomeTest extends Base {

	
	@Test
	public void verifyLogo() {
		System.out.println("in Test");
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);
		boolean expected = homePage.logo.isDisplayed();
		Assert.assertEquals(true, expected, "logo not present");
	}

	@Test
	public  void verifyMenu() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);
		boolean expected1 = homePage.menu.isDisplayed();
		Assert.assertEquals(true, expected1, "Menu not present");
	}

	@Test
	public  void verifyWorldTab() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);
		boolean expected = homePage.homeTabworld.isDisplayed();
		Assert.assertEquals(true, expected, "World Data not present");
	}

	@Test
	public  void verifyIndiaTab() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);

		boolean expected = homePage.homeTabIndia.isDisplayed();
		Assert.assertEquals(true, expected, "India Data not present");
	}
	
	@Test
	public  void verifyHomeMenu() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);

		Assert.assertEquals(true, homePage.homeMenu.isDisplayed(), "India Data not present");
	}
	@Test
	public  void verifyIndiaMenu() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);

		Assert.assertEquals(true, homePage.indiaMenu.isDisplayed(), "India Data not present");		
	}
	@Test
	public  void verifyLiveTableMenu() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);

		Assert.assertEquals(true, homePage.liveTableMenu.isDisplayed(), "India Data not present");		
	}
	@Test
	public  void verifyLiveMapMenu() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);
		Assert.assertEquals(true, homePage.liveMapMenu.isDisplayed(), "India Data not present");		
	}
	@Test
	public  void verifyCaseAnalysisMenu() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);
		Assert.assertEquals(true, homePage.caseAnalysisMenu.isDisplayed(), "India Data not present");
	}
	@Test
	public  void verifyPredictionMenu() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);
		Assert.assertEquals(true, homePage.predictionMenu.isDisplayed(), "India Data not present");
	}
	@Test
	public  void verifyAboutCoronaMenu() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);
		Assert.assertEquals(true, homePage.aboutCoronaMenu.isDisplayed(), "India Data not present");
	}
	@Test
	public  void verifyContributorMenu() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);
		Assert.assertEquals(true, homePage.contributors.isDisplayed(), "India Data not present");
	}
	@Test
	public  void verifyChartButton() {
		HomePage homePage = PageFactory.initElements(Base.driver, HomePage.class);
		Assert.assertEquals(true, homePage.chartButton.isDisplayed(), "India Data not present");
	}
}
