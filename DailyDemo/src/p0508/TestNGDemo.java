package p0508;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestNGDemo extends BaseParpare{
  @Test(description="����google")
  public void search() {
	  WebElement input  = driver.findElement(By.id("kw1"));
	  input.sendKeys("google");
	  WebElement searchButton  = driver.findElement(By.id("su1"));
	  searchButton.click();
  }
  @Test(description="��󻯴���")
  public void maxWindow(){
	   driver.manage().window().maximize();
  }
  



}
