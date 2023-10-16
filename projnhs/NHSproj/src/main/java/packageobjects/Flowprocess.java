package packageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractClass.AbstractClass;

public class Flowprocess extends AbstractClass {

	WebDriver driver;
	public Flowprocess(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//fieldset[@id='livingCountry_fieldset']/div[@class='multiple-choice']")
	List<WebElement> Country;
	
	@FindBy(xpath="//fieldset[@id='gpPracticeInScotlandOrWales_fieldset']/div[@class='multiple-choice']")
	List<WebElement> gpprac;
	
	@FindBy(xpath="//fieldset[@id='dentalPracticeCountry_fieldset']/div[@class='multiple-choice']")
	List<WebElement> dental;
	
	@FindBy(id="dob-day")
	WebElement Day;
	
	@FindBy(id="dob-month")
	WebElement Month;
	
	@FindBy(id="dob-year")
	WebElement Year;
	
	@FindBy(xpath="//fieldset[@id='partner_fieldset']/div[@class='multiple-choice']")
	List<WebElement> partner; 
	
	@FindBy(xpath="//fieldset[@id='benefits-or-tax-credit_fieldset']/div[@class='multiple-choice']")
	List<WebElement> benefits;
	
	@FindBy(xpath="fieldset[@id='pregnant-or-giving-birth_fieldset']/div[@class='multiple-choice']")
	List<WebElement> preg;
	
	@FindBy(xpath="//fieldset[@id='warPension_fieldset']/div[@class='multiple-choice']")
	List<WebElement> pension;
	
	@FindBy(xpath="//fieldset[@id='diabetes_fieldset']/div[@class='multiple-choice']")
	List<WebElement> diabetes;
	
	@FindBy(xpath="//fieldset[@id='medicalConditionConfirmed_fieldset']/div[@class='multiple-choice']")
	List<WebElement> medical;
	
	@FindBy(xpath="//fieldset[@id='glaucoma_fieldset']/div[@class='multiple-choice']")
	List<WebElement> glaucoma;
	
	@FindBy(xpath="//fieldset[@id='inCareHome_fieldset']/div[@class='multiple-choice']")
	List<WebElement> carehome;
	
	@FindBy(xpath="//fieldset[@id='savings_fieldset']/div[@class='multiple-choice']")
	List<WebElement> savings;
	
	public void clickCountry(String countryliving) throws InterruptedException {
		for(int i=1;i<=Country.size();i++) {
		WebElement ctry = Country.stream().filter(a->a.getText().equals(countryliving)).findFirst().orElse(null);
		ctry.click();
		scrolldown();
		gotonextpage();
		WaitforWebElementvisible(next);
		
		}
	}
	
	public void clickgppractice(String gppracanswer) throws InterruptedException {
		for(int i=0;i<gpprac.size();i++) {

			WebElement gp = gpprac.stream().filter(a->a.getText().equals(gppracanswer)).findFirst().orElse(null);
			gp.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}}
		
	public void dentalpractice(String dentalanswer) throws InterruptedException {
		for(int i=0;i<dental.size();i++) {
			WebElement den = dental.stream().filter(a->a.getText().equals(dentalanswer)).findFirst().orElse(null);
			den.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}
		}
		
		public void DOB(String date,String month,String year) throws InterruptedException {
		Day.sendKeys(date);
		Month.sendKeys(month);
		Year.sendKeys(year);
		scrolldown();
		gotonextpage();
		WaitforWebElementvisible(next);
		}
		
		public void Partner(String Partneranswer) throws InterruptedException {
		for(int i=0;i<partner.size();i++) {

			WebElement gp = partner.stream().filter(a->a.getText().equals(Partneranswer)).findFirst().orElse(null);
			gp.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}}
		
		public void Benefits(String benefitsanswer) throws InterruptedException {
		for(int i=0;i<benefits.size();i++) {

			WebElement gp = benefits.stream().filter(a->a.getText().equals(benefitsanswer)).findFirst().orElse(null);
			gp.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}
		}
		public void pregnancy(String pregnancyanswer) throws InterruptedException {
		for(int i=0;i<preg.size();i++) {

			WebElement gp = preg.stream().filter(a->a.getText().equals(pregnancyanswer)).findFirst().orElse(null);
			gp.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}
		}
		
		public void Pension(String pensionanswer) throws InterruptedException {
		for(int i=0;i<pension.size();i++) {

			WebElement war = pension.stream().filter(a->a.getText().equals(pensionanswer)).findFirst().orElse(null);
			war.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}
		}
		
		public void Diabetes(String diabetesanswer) throws InterruptedException {
		for(int i=0;i<diabetes.size();i++) {

			WebElement diab = diabetes.stream().filter(a->a.getText().equals(diabetesanswer)).findFirst().orElse(null);
			diab.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}
		}
		
		public void Medical(String medicalanswer) throws InterruptedException {
		for(int i=0;i<medical.size();i++) {
			WebElement med = medical.stream().filter(a->a.getText().equals(medicalanswer)).findFirst().orElse(null);
			med.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}
		}
		
		public void Glaucoma(String glaucomaanswer) throws InterruptedException {
		for(int i=0;i<glaucoma.size();i++) {
			WebElement glau = glaucoma.stream().filter(a->a.getText().equals(glaucomaanswer)).findFirst().orElse(null);
			glau.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}}
		
		public void Carehome(String carehomeanswer) throws InterruptedException {
		for(int i=0;i<carehome.size();i++) {
			WebElement care = carehome.stream().filter(a->a.getText().equals(carehomeanswer)).findFirst().orElse(null);
			care.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}}
		
		public void Savings(String savingsanswer) throws InterruptedException {
			for(int i=0;i<savings.size();i++) {
				WebElement save = savings.stream().filter(a->a.getText().equals(savingsanswer)).findFirst().orElse(null);
				save.click();
			scrolldown();
			gotonextpage();
			WaitforWebElementvisible(next);
		}}
}
