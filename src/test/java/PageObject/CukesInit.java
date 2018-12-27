package PageObject;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class CukesInit {

	public static WebDriver driver;
	public static boolean bResult;
	 
	public CukesInit(WebDriver driver){
		CukesInit.driver = driver;
		CukesInit.bResult = true;
	 }
	
	@Given("^I navigate to \"(.*?)\"$")
	public void i_navigate_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.err.println("-=========-=-==-=s-fsfas=fafidIJFAd::::::"+arg1);
		driver.get(arg1);
	}
	
	
}
