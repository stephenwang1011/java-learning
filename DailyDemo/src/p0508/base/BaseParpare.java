package p0508.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseParpare {
	public static WebDriver driver=null;
	@BeforeSuite(description="ע��ķ�����ֻ����һ�Σ��������в���ǰ���׼��С�")
	  public void beforeSuite(ITestContext context) {
	  String chromeDriverPath = context.getCurrentXmlTest().getParameter("chromeDriverPath");
	  String URL = context.getCurrentXmlTest().getParameter("urlBaidu");
		System.setProperty("webdriver.chrome.driver",	 chromeDriverPath);
		driver = new ChromeDriver();
		driver.get(URL);
	  }
	
	  @AfterSuite(description="ע��ķ�����ֻ����һ�δ��׼��е����в��Զ�����֮��")
	  public void afterSuite() {
		 driver.quit();
	  }

}
