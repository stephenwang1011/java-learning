package p0508.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseParpare {
	public static WebDriver driver=null;
	@BeforeSuite(description="注解的方法将只运行一次，运行所有测试前此套件中。")
	  public void beforeSuite(ITestContext context) {
	  String chromeDriverPath = context.getCurrentXmlTest().getParameter("chromeDriverPath");
	  String URL = context.getCurrentXmlTest().getParameter("urlBaidu");
		System.setProperty("webdriver.chrome.driver",	 chromeDriverPath);
		driver = new ChromeDriver();
		driver.get(URL);
	  }
	
	  @AfterSuite(description="注解的方法将只运行一次此套件中的所有测试都运行之后。")
	  public void afterSuite() {
		 driver.quit();
	  }

}
