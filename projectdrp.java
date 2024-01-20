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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/1a0aca83-b3b2-4ee7-ac00-4eace5382d28
@TestModellerModule(guid = "1a0aca83-b3b2-4ee7-ac00-4eace5382d28")
public class projectdrp extends BasePage
{
	public projectdrp (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier prj_dropElem = new WebIdentifier(By.xpath("//label[normalize-space()= 'Project ID']/../div/div"), 100064l);;

	private WebIdentifier Project_nameElem = new WebIdentifier(By.xpath("/html/body/form/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/input"), 100065l);;


	
     
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
 	 * Click prj drop
     * @name Click prj drop
     */
    public void Click_prj_drop()
    {
         
        WebElement elem = getWebElement(prj_dropElem);

        if (elem == null) {
            failStep("Click_prj_drop", "Click_prj_drop failed. Identifier Error: Unable to locate object: " + prj_dropElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_prj_drop");    
        }

        m_Driver.switchTo().defaultContent();
    }
    
	/**
 	 * DoubleClick Project name
     * @name DoubleClick Project name
     */
	public void DoubleClick_Project_name()
	{
	    (new pages.WebGeneralActionsFunctions(m_Driver)).DoubleClick(Project_nameElem);
	}
	
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}
}