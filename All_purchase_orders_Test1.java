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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/d58f9776-688e-4743-bf13-5bb0bc34ddaf
@TestModellerModule(guid = "d58f9776-688e-4743-bf13-5bb0bc34ddaf")
public class All_purchase_orders_Test1 extends BasePage
{
	public All_purchase_orders_Test1 (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier Purchase_orderElem = new WebIdentifier(By.xpath("//INPUT[@id='PurchTable_PurchIdAdvanced_3_0_0_input']"), 100076l);;

	private WebIdentifier Purchase_order_1Elem = new WebIdentifier(By.xpath("//INPUT[@id='PurchTable_PurchIdAdvanced_3_0_201_input']"), 100077l);;


	
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T08%3A46%3A34.9219208Z&cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T08%3A46%3A34.9219208Z&cmp=USMF&mi=PurchTableListPage");
	}

     
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

      
	/**
 	 * Enter Purchase order
     * @name Enter Purchase order
     */
 	public void Enter_Purchase_order(String Purchase_order)
 	{
 	    
 		WebElement elem = getWebElement(Purchase_orderElem);

 		if (elem == null) {
            failStep("Enter_Purchase_order", "Enter_Purchase_order failed. Identifier Error: Unable to locate object: " + Purchase_orderElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.clear();
                elem.sendKeys(Purchase_order);
            } catch (Exception e) {
    		    JavascriptExecutor jse = (JavascriptExecutor) m_Driver;
    		    jse.executeScript("arguments[0].value='" + Purchase_order + "';", elem);
            }
    
      		passStep("Enter_Purchase_order " + Purchase_order);    
        }

 		m_Driver.switchTo().defaultContent();
 	}

    
	/**
 	 * Select Purchase order
     * @name Select Purchase order
     */
    public void Select_Purchase_order_1(String Purchase_order)
 	{
 	    
 		WebElement elem = getWebElement(Purchase_order_1Elem);

 		if (elem == null) {
            failStep(m_Driver, "Select_Purchase_order_1", "Select_Purchase_order_1 failed. Identifier Error: Unable to locate object: " + Purchase_order_1Elem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
     		Select dropdown = new Select(elem);
    
     		dropdown.selectByVisibleText(Purchase_order);

     		passStep("Select_Purchase_order_1 " + Purchase_order);    
        }

 		m_Driver.switchTo().defaultContent();
 	}
}