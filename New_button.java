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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/333d2d0f-5ebd-4141-9540-5631630e8a7a
@TestModellerModule(guid = "333d2d0f-5ebd-4141-9540-5631630e8a7a")
public class New_button extends BasePage
{
	public New_button (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier UnknownElem = new WebIdentifier(By.xpath("//label[normalize-space()= 'One-time supplier']/../div/span[1]"), 100041l);;

	private WebIdentifier PurchTable_OrderAccountElem = new WebIdentifier(By.xpath("//label[normalize-space()= 'Supplier account']/../input"), 100042l);;


	
     
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
 	 * Click 
     * @name Click 
     */
    public void Click_Unknown()
    {
         
        WebElement elem = getWebElement(UnknownElem);

        if (elem == null) {
            failStep("Click_Unknown", "Click_Unknown failed. Identifier Error: Unable to locate object: " + UnknownElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Unknown");    
        }

        m_Driver.switchTo().defaultContent();
    }
      
	/**
 	 * Enter PurchTable_OrderAccount
     * @name Enter PurchTable_OrderAccount
     */
 	public void Enter_PurchTable_OrderAccount(String PurchTable_OrderAccount)
 	{
 	    
 		WebElement elem = getWebElement(PurchTable_OrderAccountElem);

 		if (elem == null) {
            failStep("Enter_PurchTable_OrderAccount", "Enter_PurchTable_OrderAccount failed. Identifier Error: Unable to locate object: " + PurchTable_OrderAccountElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.clear();
                elem.sendKeys(PurchTable_OrderAccount);
            } catch (Exception e) {
    		    JavascriptExecutor jse = (JavascriptExecutor) m_Driver;
    		    jse.executeScript("arguments[0].value='" + PurchTable_OrderAccount + "';", elem);
            }
    
      		passStep("Enter_PurchTable_OrderAccount " + PurchTable_OrderAccount);    
        }

 		m_Driver.switchTo().defaultContent();
 	}

	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}
}