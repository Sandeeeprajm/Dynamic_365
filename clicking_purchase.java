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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/5cfa2fb0-e538-4bce-9f63-2267aaecbb73
@TestModellerModule(guid = "5cfa2fb0-e538-4bce-9f63-2267aaecbb73")
public class clicking_purchase extends BasePage
{
	public clicking_purchase (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier All_purchase_ordersElem = new WebIdentifier(By.xpath("//A[@data-dyn-title='All purchase orders']"), 100034l);;

	private WebIdentifier Purchase_orderElem = new WebIdentifier(By.xpath("/html/body/div[2]/div/div[6]/div/form[2]/div[5]/div/div[3]/div[2]/div[1]/div[4]/div/div[2]/div/div/div/div[1]/div[3]/div[11]/div/div[1]/div[2]/div/div[1]/div/div/div/div/div/div/input"), 100036l);;

	private WebIdentifier Purchase_order_1Elem = new WebIdentifier(By.xpath("/html/body/div[2]/div/div[6]/div/form[2]/div[5]/div/div[3]/div[2]/div[1]/div[4]/div/div[2]/div/div/div/div[1]/div[3]/div[9]/div/div[1]/div[2]/div/div[1]/div/div/div/div/div/div/input"), 100035l);;


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage";

        if (!currentUrl.equals("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click All purchase orders
     * @name Click All purchase orders
     */
    public void Click_All_purchase_orders()
    {
         
        WebElement elem = getWebElement(All_purchase_ordersElem);

        if (elem == null) {
            failStep("Click_All_purchase_orders", "Click_All_purchase_orders failed. Identifier Error: Unable to locate object: " + All_purchase_ordersElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_All_purchase_orders");    
        }

        m_Driver.switchTo().defaultContent();
    }
      
	/**
 	 * Enter Purchase order
     * @name Enter Purchase order
     */
 	public void Enter_Purchase_order_1(String Purchase_order)
 	{
 	    
 		WebElement elem = getWebElement(Purchase_orderElem);

 		if (elem == null) {
            failStep("Enter_Purchase_order_1", "Enter_Purchase_order_1 failed. Identifier Error: Unable to locate object: " + Purchase_orderElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.clear();
                elem.sendKeys(Purchase_order);
            } catch (Exception e) {
    		    JavascriptExecutor jse = (JavascriptExecutor) m_Driver;
    		    jse.executeScript("arguments[0].value='" + Purchase_order + "';", elem);
            }
    
      		passStep("Enter_Purchase_order_1 " + Purchase_order);    
        }

 		m_Driver.switchTo().defaultContent();
 	}

      
	/**
 	 * Enter Purchase order
     * @name Enter Purchase order
     */
 	public void Enter_Purchase_order(String Purchase_order)
 	{
 	    
 		WebElement elem = getWebElement(Purchase_order_1Elem);

 		if (elem == null) {
            failStep("Enter_Purchase_order", "Enter_Purchase_order failed. Identifier Error: Unable to locate object: " + Purchase_order_1Elem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
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

	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}
}