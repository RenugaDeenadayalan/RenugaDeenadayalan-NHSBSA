package nhsTest;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import testComponents.BaseclassTest;

public class Testing extends BaseclassTest{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//				String[] prods = {"ZARA COAT 3","IPHONE 13 PRO"};
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		Thread.sleep(1000);
		driver.findElement(By.id("next-button")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='livingCountry_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> Country = driver.findElements(By.xpath("//fieldset[@id='livingCountry_fieldset']/div[@class='multiple-choice']"));
		System.out.println(Country.size());
		for(int i=0;i<Country.size();i++) {
			System.out.println(Country.get(i).getText());
			WebElement ctry = Country.stream().filter(a->a.getText().equals("England")).findFirst().orElse(null);
			ctry.click();
		}
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='gpPracticeInScotlandOrWales_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> gpprac = driver.findElements(By.xpath("//fieldset[@id='gpPracticeInScotlandOrWales_fieldset']/div[@class='multiple-choice']"));
		System.out.println(gpprac.size());
		for(int i=0;i<gpprac.size();i++) {
			System.out.println(gpprac.get(i).getText());
			WebElement gp = gpprac.stream().filter(a->a.getText().equals("Yes")).findFirst().orElse(null);
			gp.click();
		}
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='dentalPracticeCountry_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> dental = driver.findElements(By.xpath("//fieldset[@id='dentalPracticeCountry_fieldset']/div[@class='multiple-choice']"));
		System.out.println(dental.size());
		for(int i=0;i<dental.size();i++) {
			System.out.println(dental.get(i).getText());
			WebElement den = dental.stream().filter(a->a.getText().equals("England")).findFirst().orElse(null);
			den.click();
		}
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("dob-day"))));
		driver.findElement(By.id("dob-day")).sendKeys("11");
		driver.findElement(By.id("dob-month")).sendKeys("05");
		driver.findElement(By.id("dob-year")).sendKeys("1998");
		JavascriptExecutor js4 = (JavascriptExecutor)  driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();
		

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='partner_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> partner = driver.findElements(By.xpath("//fieldset[@id='partner_fieldset']/div[@class='multiple-choice']"));
		System.out.println(partner.size());
		for(int i=0;i<partner.size();i++) {
			System.out.println(partner.get(i).getText());
			WebElement gp = partner.stream().filter(a->a.getText().equals("Yes")).findFirst().orElse(null);
			gp.click();
		}
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='benefits-or-tax-credit_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> benefits = driver.findElements(By.xpath("//fieldset[@id='benefits-or-tax-credit_fieldset']/div[@class='multiple-choice']"));
		System.out.println(benefits.size());
		for(int i=0;i<benefits.size();i++) {
			System.out.println(benefits.get(i).getText());
			WebElement gp = benefits.stream().filter(a->a.getText().equals("No")).findFirst().orElse(null);
			gp.click();
		}
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='pregnant-or-giving-birth_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> preg = driver.findElements(By.xpath("//fieldset[@id='pregnant-or-giving-birth_fieldset']/div[@class='multiple-choice']"));
		System.out.println(preg.size());
		for(int i=0;i<preg.size();i++) {
			System.out.println(preg.get(i).getText());
			WebElement gp = preg.stream().filter(a->a.getText().equals("No")).findFirst().orElse(null);
			gp.click();
		}
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='warPension_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> pension = driver.findElements(By.xpath("//fieldset[@id='warPension_fieldset']/div[@class='multiple-choice']"));
		System.out.println(pension.size());
		for(int i=0;i<pension.size();i++) {
			System.out.println(pension.get(i).getText());
			WebElement war = pension.stream().filter(a->a.getText().equals("No")).findFirst().orElse(null);
			war.click();
		}
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='diabetes_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> diabetes = driver.findElements(By.xpath("//fieldset[@id='diabetes_fieldset']/div[@class='multiple-choice']"));
		System.out.println(diabetes.size());
		for(int i=0;i<diabetes.size();i++) {
			System.out.println(diabetes.get(i).getText());
			WebElement diab = diabetes.stream().filter(a->a.getText().equals("No")).findFirst().orElse(null);
			diab.click();
		}
		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='medicalConditionConfirmed_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> medical = driver.findElements(By.xpath("//fieldset[@id='medicalConditionConfirmed_fieldset']/div[@class='multiple-choice']"));
		System.out.println(medical.size());
		for(int i=0;i<medical.size();i++) {
			System.out.println(medical.get(i).getText());
			WebElement med = medical.stream().filter(a->a.getText().equals("No")).findFirst().orElse(null);
			med.click();
		}
		JavascriptExecutor js10 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='glaucoma_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> glaucoma = driver.findElements(By.xpath("//fieldset[@id='glaucoma_fieldset']/div[@class='multiple-choice']"));
		System.out.println(glaucoma.size());
		for(int i=0;i<glaucoma.size();i++) {
			System.out.println(glaucoma.get(i).getText());
			WebElement glau = glaucoma.stream().filter(a->a.getText().equals("No")).findFirst().orElse(null);
			glau.click();
		}
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='inCareHome_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> carehome = driver.findElements(By.xpath("//fieldset[@id='inCareHome_fieldset']/div[@class='multiple-choice']"));
		System.out.println(carehome.size());
		for(int i=0;i<glaucoma.size();i++) {
			System.out.println(carehome.get(i).getText());
			WebElement care = carehome.stream().filter(a->a.getText().equals("No")).findFirst().orElse(null);
			care.click();
		}
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//fieldset[@id='savings_fieldset']/div[@class='multiple-choice']"))));
		List<WebElement> savings = driver.findElements(By.xpath("//fieldset[@id='savings_fieldset']/div[@class='multiple-choice']"));
		System.out.println(savings.size());
		for(int i=0;i<savings.size();i++) {
			System.out.println(savings.get(i).getText());
			WebElement care = savings.stream().filter(a->a.getText().equals("No")).findFirst().orElse(null);
			care.click();
		}
		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.id("next-button")).click();
		
	}


	}

//
//

