package trackcoronaObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//img[@title='Track Corona Logo']")
	public WebElement logo;

	@FindBy(xpath ="//*[@class ='row dropdownmenu gs-header']" )
	public WebElement menu;

	@FindBy(xpath = "//*[@id='react-entry-point']/div/div[1]/ul/li[1]/a")
	public WebElement homeMenu;
	
	@FindBy(xpath = "//*[@id='react-entry-point']/div/div[1]/ul/li[2]/a")
	public WebElement indiaMenu;
	
	@FindBy(xpath = "//*[@id='react-entry-point']/div/div[1]/ul/li[3]/a")
	public WebElement liveTableMenu;
	
	@FindBy(xpath = "//*[@id='react-entry-point']/div/div[1]/ul/li[4]/a")
	public WebElement liveMapMenu;
	
	@FindBy(xpath = "//*[@id='react-entry-point']/div/div[1]/ul/li[5]/a")
	public WebElement caseAnalysisMenu;
	
	@FindBy(xpath = "//*[@id='react-entry-point']/div/div[1]/ul/li[6]/a")
	public WebElement predictionMenu;
	
	@FindBy(xpath = "//*[@id='react-entry-point']/div/div[1]/ul/li[7]/a")
	public WebElement aboutCoronaMenu;
	
	@FindBy(xpath = "//*[@id='react-entry-point']/div/div[1]/ul/li[8]/a")
	public WebElement contributors;
		
	@FindBy(xpath = "//*[@id='home-tabs-with-classes']/div[1]/span")
	public WebElement homeTabworld;

	@FindBy(xpath = "//*[@id='home-tabs-with-classes']/div[2]/span")
	public WebElement homeTabIndia;
	
	@FindBy(xpath = "//*[@id='home-tabs-content']")
	public WebElement homeTabContent;
	
	@FindBy(xpath = "//*[@id='home-tabs-content']/div/div[1]")
	public WebElement statistics;
	
	@FindBy(xpath = "//*[@id='world-map']")
	public WebElement worldMap;
	
	@FindBy(xpath = "//*[@id='india-map']")
	public WebElement indiaMap;
	
	@FindBy(xpath = "//*[@id='india-pie-chart']")
	public WebElement indiaPieChart;

	@FindBy(xpath = "//*[@id='pie-chart']")
	public WebElement WorldPieChart;
	
	@FindBy(xpath = "//*[@id='customerly-launcher-button-icon']")
	public WebElement chartButton;
	
	

//	@FindBy(xpath = "x")
//	public WebElement x;
	
}
