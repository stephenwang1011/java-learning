package p0418;
/*
 * 
 * 介绍：WebDriverWait类的构造方法接受了一个WebDriver对象和一个等待最长时间（10秒）。然后调用
until方法，其中重写了ExpectedCondition接口中的apply方法，让其返回一个WebElement,即加载完成的元
素，然后点击。默认情况下，WebDriverWait每500毫秒调用一次ExpectedCondition，直到有成功的返回，当然如果超
过设定的值还没有成功的返回，将抛出异常。
 * 
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDIV {
	public static WebDriver dr = null;

	public static void main(String[] args) {
		try{
				System.setProperty("webdriver.chrome.driver","E:\\DevEnvironment\\WebDriver\\chrome\\chromedriver.exe");
				dr = new ChromeDriver();
				String url = "C:\\Users\\Stephen\\Desktop\\wait.html";
				dr.get(url);
				WebDriverWait wait = new WebDriverWait(dr,10);
				wait.until(new ExpectedCondition<WebElement>(){
				@Override
				public WebElement apply(WebDriver d) {
				return d.findElement(By.id("b"));
				}}).click();
				WebElement element = dr.findElement(By.cssSelector(".red_box"));
				 ((JavascriptExecutor)dr).executeScript("arguments[0].style.border = \"5px solid yellow\"",element);    
				}
				
	catch(Exception e){
		
		
	}finally{
	//	dr.quit();
	
	}
	}


}
