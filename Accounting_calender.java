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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/6307e7da-5fc5-40b4-9ca7-e05129749cb5
@TestModellerModule(guid = "6307e7da-5fc5-40b4-9ca7-e05129749cb5")
public class Accounting_calender extends BasePage
{
	public Accounting_calender (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier Accounting_date_drpElem = new WebIdentifier(By.xpath("//label[normalize-space()= 'Accounting date']/../div/div[2]/div"), 100081l);;

	private WebIdentifier date_clickElem = new WebIdentifier(By.xpath("//A[@id='idDay-12']"), 100082l);;


	
     
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
 	 * Click Accounting date drp
     * @name Click Accounting date drp
     */
    public void Click_Accounting_date_drp()
    {
         
        WebElement elem = getWebElement(Accounting_date_drpElem);

        if (elem == null) {
            failStep("Click_Accounting_date_drp", "Click_Accounting_date_drp failed. Identifier Error: Unable to locate object: " + Accounting_date_drpElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Accounting_date_drp");    
        }

        m_Driver.switchTo().defaultContent();
    }
      
	/**
 	 * Click date click
     * @name Click date click
     */
    public void Click_date_click()
    {
         
        WebElement elem = getWebElement(date_clickElem);

        if (elem == null) {
            failStep("Click_date_click", "Click_date_click failed. Identifier Error: Unable to locate object: " + date_clickElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_date_click");    
        }

        m_Driver.switchTo().defaultContent();
    }
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}
}