package trackcoronaTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import trackcoronaCommonLib.Base;
import trackcoronaObjRepo.HomePage;

public class HomeTest {

	@Test
	public static void verifyLogo() {

		HomePage homePage = PageFactory.initElements(Base.Driver, HomePage.class);
		boolean expected = homePage.Logo.isDisplayed();
		Assert.assertEquals(true, expected, "Logo not present");
	}

	@Test
	public static void verifyMenu() {

		HomePage homePage = PageFactory.initElements(Base.Driver, HomePage.class);
		boolean expected = homePage.menu.isDisplayed();
		Assert.assertEquals(true, expected, "Menu not present");
	}

	@Test
	public static void verifyWorldData() {

		HomePage homePage = PageFactory.initElements(Base.Driver, HomePage.class);
		boolean expected = homePage.world.isDisplayed();
		Assert.assertEquals(true, expected, "World Data not present");
	}

	@Test
	public static void verifyIndiaData() {

		HomePage homePage = PageFactory.initElements(Base.Driver, HomePage.class);
		boolean expected = homePage.india.isDisplayed();
		Assert.assertEquals(true, expected, "India Data not present");
	}

}
