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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/e90c5a15-e3d3-4408-a4b4-bce904ecb80c
@TestModellerModule(guid = "e90c5a15-e3d3-4408-a4b4-bce904ecb80c")
public class requested_date extends BasePage
{
	public requested_date (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier date_clickElem = new WebIdentifier(By.xpath("//A[@id='idDay-15']"), 100084l);;

	private WebIdentifier Requested_date_drpElem = new WebIdentifier(By.xpath("//label[normalize-space()= 'Requested receipt date']/../div/div[2]/div"), 100083l);;


	
     
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
      
	/**
 	 * Click Requested date drp
     * @name Click Requested date drp
     */
    public void Click_Requested_date_drp()
    {
         
        WebElement elem = getWebElement(Requested_date_drpElem);

        if (elem == null) {
            failStep("Click_Requested_date_drp", "Click_Requested_date_drp failed. Identifier Error: Unable to locate object: " + Requested_date_drpElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Requested_date_drp");    
        }

        m_Driver.switchTo().defaultContent();
    }
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}
}