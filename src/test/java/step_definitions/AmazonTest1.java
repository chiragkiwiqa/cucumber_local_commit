package step_definitions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import IndexPage.AmazonSearch;
import PageObject.AmazonSearchPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;
import utility.Common;

public class AmazonTest1{
 public final WebDriver driver;
	  
	 public AmazonTest1(SharedDriver driver) throws MalformedURLException{
	   this.driver = new SharedDriver();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	  }

	 @Given("^I navigate to \"(.*?)\"$")
	 public void i_navigate_to(String arg1) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 driver.get(arg1);
	 }
	 
	 @Given("^Enter search key : \"(.*?)\"$")
	 public void enter_search_key(String arg1) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(arg1+Keys.ENTER);
		 System.err.println("=====================================");
	 }
	 
	@Given("^Choose Heighest to Lowest Price filter option$")
	public void choose_Heighest_to_Lowest_Price_filter_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement sortBy=driver.findElement(By.id("sort"));
		Common.selectFromComboByVisibleText(sortBy, "Price: High to Low");
		System.err.println("Wait done .. ");
		System.err.println("=====================================");
	}

	@Given("^Choose Second item from search result$")
	public void choose_Second_item_from_search_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Common.pause(10);
		WebElement resultItem=driver.findElement(By.xpath("//ul[@id='s-results-list-atf']/li[2]//a/h2"));
		Common.clickOn(driver, resultItem);
	}

	@Then("^Product Name text should contains : \"(.*?)\"$")
	public void product_Name_text_should_contains(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement resultItem=driver.findElement(By.id("productTitle"));
		String str=resultItem.getText();
		org.junit.Assert.assertTrue(str.contains("Nikon AF-S"));
	}
	
}
