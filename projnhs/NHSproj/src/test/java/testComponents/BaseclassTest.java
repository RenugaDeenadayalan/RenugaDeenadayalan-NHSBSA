package testComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;
import packageobjects.LandingPage;
import packageobjects.Flowprocess;

public class BaseclassTest {
	public WebDriver driver;
	public LandingPage landingpage;
	public static Flowprocess flowprocess;
	
	public WebDriver initializedriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream filestream = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/Globaldata.properties");
		prop.load(filestream);
		
		String browserName = System.getProperty("browser")!=null ? System.getProperty("browser"):prop.getProperty("browser");

//		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
	}
	@BeforeMethod(alwaysRun = true)
	public LandingPage launchlandingpage() throws IOException {
		driver = initializedriver();
		landingpage = new LandingPage(driver);
		landingpage.goToNHSWebsite();
		return landingpage;
	}
	
	@AfterMethod(alwaysRun = true)
	public void Closedriver() {
		driver.close();
	}
	
	
	public String getScreenshot(String TestCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Scrnsht = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Scrnsht, new File(System.getProperty("User.dir")+"//reports//"+TestCaseName+".png"));
		return System.getProperty("User.dir")+"//reports//"+TestCaseName+".png";
	}
	
	public List<HashMap<String, String>> getjsontoMap(String JsonFile) throws IOException {
		String jsonstring = FileUtils.readFileToString(new File(System.getProperty("user.dir")+JsonFile),StandardCharsets.UTF_8);
		
		//jsonstring to hashmap
		
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String,String>> data =mapper.readValue(jsonstring, new TypeReference<List<HashMap<String,String>>>(){});
		return data;
		
	}


	
}
