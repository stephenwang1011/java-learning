package p0418;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitUtil {


	public void clickByIDAfterWait(WebDriver driver,int timeOutTime,final String ID){
				WebDriverWait wait = new WebDriverWait(driver,timeOutTime);
				wait.until(new ExpectedCondition<WebElement>(){
				@Override
				public WebElement apply(WebDriver d) {
				return d.findElement(By.id(ID));
				}}).click();

	}

	public void clickByNameAfterWait(WebDriver driver,int timeOutTime,final String name){
		WebDriverWait wait = new WebDriverWait(driver,timeOutTime);
		wait.until(new ExpectedCondition<WebElement>(){
		@Override
		public WebElement apply(WebDriver d) {
		return d.findElement(By.name(name));
		}}).click();

}
	
	public void clickByXpathAfterWait(WebDriver driver,int timeOutTime,final String xpath){
		WebDriverWait wait = new WebDriverWait(driver,timeOutTime);
		wait.until(new ExpectedCondition<WebElement>(){
		@Override
		public WebElement apply(WebDriver d) {
		return d.findElement(By.xpath(xpath));
		}}).click();

}
	
	public void clickByClassNameAfterWait(WebDriver driver,int timeOutTime,final String classname){
		WebDriverWait wait = new WebDriverWait(driver,timeOutTime);
		wait.until(new ExpectedCondition<WebElement>(){
		@Override
		public WebElement apply(WebDriver d) {
		return d.findElement(By.className(classname));
		}}).click();

}
	
	public void clickByCSSAfterWait(WebDriver driver,int timeOutTime,final String css){
		WebDriverWait wait = new WebDriverWait(driver,timeOutTime);
		wait.until(new ExpectedCondition<WebElement>(){
		@Override
		public WebElement apply(WebDriver d) {
		return d.findElement(By.cssSelector(css));
		}}).click();

}
	
	public void clickByLinkTextAfterWait(WebDriver driver,int timeOutTime,final String linktext){
		WebDriverWait wait = new WebDriverWait(driver,timeOutTime);
		wait.until(new ExpectedCondition<WebElement>(){
		@Override
		public WebElement apply(WebDriver d) {
		return d.findElement(By.linkText(linktext));
		}}).click();

}

	public void clickByTagNameAfterWait(WebDriver driver,int timeOutTime,final String tagname){
		WebDriverWait wait = new WebDriverWait(driver,timeOutTime);
		wait.until(new ExpectedCondition<WebElement>(){
		@Override
		public WebElement apply(WebDriver d) {
		return d.findElement(By.tagName(tagname));
		}}).click();

}
}
