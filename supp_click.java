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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/04ce4d8f-598c-4121-a851-db2212e0fe8a
@TestModellerModule(guid = "04ce4d8f-598c-4121-a851-db2212e0fe8a")
public class supp_click extends BasePage
{
	public supp_click (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier Supplier_accountElem = new WebIdentifier(By.xpath("//INPUT['/html/body/form/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/div[1]/div[2]/div/div[1]/div/div/div/div/div/div/input']"), 100048l);;


	
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}

     
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
 	 * Enter Supplier account
     * @name Enter Supplier account
     */
 	public void Enter_Supplier_account(String Supplier_account)
 	{
 	    
 		WebElement elem = getWebElement(Supplier_accountElem);

 		if (elem == null) {
            failStep("Enter_Supplier_account", "Enter_Supplier_account failed. Identifier Error: Unable to locate object: " + Supplier_accountElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.clear();
                elem.sendKeys(Supplier_account);
            } catch (Exception e) {
    		    JavascriptExecutor jse = (JavascriptExecutor) m_Driver;
    		    jse.executeScript("arguments[0].value='" + Supplier_account + "';", elem);
            }
    
      		passStep("Enter_Supplier_account " + Supplier_account);    
        }

 		m_Driver.switchTo().defaultContent();
 	}
}