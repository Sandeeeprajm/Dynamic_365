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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/02229b48-4a0f-4084-9593-f1ef9c36a3fe
@TestModellerModule(guid = "02229b48-4a0f-4084-9593-f1ef9c36a3fe")
public class dont extends BasePage
{
	public dont (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier YesElem = new WebIdentifier(By.xpath("//INPUT[@id='idSIButton9']"), 100032l);;


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://login.microsoftonline.com/common/login";

        if (!currentUrl.equals("https://login.microsoftonline.com/common/login")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click Yes
     * @name Click Yes
     */
    public void Click_Yes()
    {
         
        WebElement elem = getWebElement(YesElem);

        if (elem == null) {
            failStep("Click_Yes", "Click_Yes failed. Identifier Error: Unable to locate object: " + YesElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Yes");    
        }

        m_Driver.switchTo().defaultContent();
    }
	public void GoToUrl()
	{
		m_Driver.get("https://login.microsoftonline.com/common/login");

		passStepWithScreenshot("Go to URL - https://login.microsoftonline.com/common/login");
	}
}