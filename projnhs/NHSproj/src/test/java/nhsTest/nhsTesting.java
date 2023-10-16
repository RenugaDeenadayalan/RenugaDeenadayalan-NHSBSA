package nhsTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testComponents.BaseclassTest;

public class nhsTesting extends BaseclassTest {
	

	@Test(dataProvider="getdata")
	public void firstscenario(HashMap<String,String> input) throws InterruptedException {
		flowprocess.clickCountry(input.get("countryliving"));
		flowprocess.clickgppractice(input.get("gppracanswer"));
		flowprocess.dentalpractice(input.get("dentalanswer"));
		flowprocess.DOB(input.get("date"), input.get("month"), input.get("year"));
		flowprocess.Partner(input.get("Partneranswer"));
		flowprocess.Benefits(input.get("benefitsanswer"));
		flowprocess.pregnancy(input.get("pregnancyanswer"));
		flowprocess.Pension(input.get("pensionanswer"));
		flowprocess.Diabetes(input.get("diabetesanswer"));
		flowprocess.Medical(input.get("medicalanswer"));
		flowprocess.Glaucoma(input.get("glaucomaanswer"));
		flowprocess.Carehome(input.get("carehomeanswer"));
		flowprocess.Savings(input.get("savingsanswer"));
	
	}
	
	@DataProvider
	public Object[][]  getdata() throws IOException {
		
		
		List<HashMap<String,String>> data = getjsontoMap("//src//test//java//data//dataobjects.json");

		return new Object[][] {{data.get(0)}};
	}
	

}
