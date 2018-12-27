package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchPageObject extends CukesInit{

	public AmazonSearchPageObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath=".//*[@id='twotabsearchtextbox']")
	public static WebElement searchBox;
}
