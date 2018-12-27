package IndexPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import PageObject.AmazonSearchPageObject;

public class AmazonSearch {

	public static void enterSearchKey(WebDriver driver,String str)
	{
		AmazonSearchPageObject.searchBox.sendKeys(str+Keys.ENTER);
	}
	
	
}
