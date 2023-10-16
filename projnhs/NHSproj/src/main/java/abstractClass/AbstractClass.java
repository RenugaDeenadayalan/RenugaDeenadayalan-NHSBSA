package abstractClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractClass {
	WebDriver driver;
	public AbstractClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="next-button")
	public
	WebElement next;
	
	public void WaitforWebElementvisible(WebElement wb) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	public void WaitforWebElementInvisible(WebElement wb) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
	wait.until(ExpectedConditions.invisibilityOf(wb));
	}
	
	public void WaitforWebElementsvisible(List<WebElement> wb) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfAllElements(wb));
	}
	
	public void WaitforWebElementsInvisible(List<WebElement> wb) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
	wait.until(ExpectedConditions.invisibilityOfAllElements(wb));
	}
	
	public void scrolldown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		Thread.sleep(1000);
	}
	public void gotonextpage() {
		next.click();
	}

}
