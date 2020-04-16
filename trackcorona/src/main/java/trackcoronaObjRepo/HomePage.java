package trackcoronaObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//img[@title='Track Corona Logo']")
	public WebElement Logo;
	@FindBy(className = "row dropdownmenu gs-header")
	public WebElement menu;
	@FindBy(xpath = "//*[@id='home-tabs-with-classes']/div[1]/span")
	public WebElement world;
	@FindBy(xpath = "//*[@id=\"home-tabs-with-classes\"]/div[2]/span")
	public WebElement india;

	public void click(WebElement x) {
		x.click();
	}

}
