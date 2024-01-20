package pages;
import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilities.selenium.WebIdentifier;

import com.jayway.jsonpath.JsonPath;

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/1e8cdba3-5fed-40b1-8174-a79d2ed314a2
@TestModellerModule(guid = "1e8cdba3-5fed-40b1-8174-a79d2ed314a2")
public class link extends BasePage
{
	public link (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier Purchase_orderElem = new WebIdentifier(By.xpath("//div[@class='dyn-container _1xz16d8']//input[@id='PurchTable_PurchIdAdvanced_3_0_195_input']"), 100075l);;


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T08%3A46%3A34.9219208Z&cmp=USMF&mi=PurchTableListPage";

        if (!currentUrl.equals("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T08%3A46%3A34.9219208Z&cmp=USMF&mi=PurchTableListPage")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T08%3A46%3A34.9219208Z&cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T08%3A46%3A34.9219208Z&cmp=USMF&mi=PurchTableListPage");
	}

    
	/**
 	 * Select Purchase order
     * @name Select Purchase order
     */
    public void Select_Purchase_order(String Purchase_order)
 	{
 	    
 		WebElement elem = getWebElement(Purchase_orderElem);

 		if (elem == null) {
            failStep(m_Driver, "Select_Purchase_order", "Select_Purchase_order failed. Identifier Error: Unable to locate object: " + Purchase_orderElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
     		Select dropdown = new Select(elem);
    
     		dropdown.selectByVisibleText(Purchase_order);

     		passStep("Select_Purchase_order " + Purchase_order);    
        }

 		m_Driver.switchTo().defaultContent();
 	}
}