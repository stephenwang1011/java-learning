package p0418;
/*
 * 
 * ���ܣ�WebDriverWait��Ĺ��췽��������һ��WebDriver�����һ���ȴ��ʱ�䣨10�룩��Ȼ�����
until������������д��ExpectedCondition�ӿ��е�apply���������䷵��һ��WebElement,��������ɵ�Ԫ
�أ�Ȼ������Ĭ������£�WebDriverWaitÿ500�������һ��ExpectedCondition��ֱ���гɹ��ķ��أ���Ȼ�����
���趨��ֵ��û�гɹ��ķ��أ����׳��쳣��
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
