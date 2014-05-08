package p0508;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseParpare {
	public static WebDriver driver=null;
	@BeforeSuite
	  public void beforeSuite(ITestContext context) {
	  String chromeDriverPath = context.getCurrentXmlTest().getParameter("chromeDriverPath");
	  String URL = context.getCurrentXmlTest().getParameter("urlBaidu");
		System.setProperty("webdriver.chrome.driver",	 chromeDriverPath);
		driver = new ChromeDriver();
		driver.get(URL);
	  }
	
	  @AfterSuite
	  public void afterSuite() {
		 driver.quit();
	  }

}
