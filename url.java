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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/3c782b83-defe-44bc-864d-d29b1814caf2
@TestModellerModule(guid = "3c782b83-defe-44bc-864d-d29b1814caf2")
public class url extends BasePage
{
	public url (WebDriver driver)
	{
		super(driver);
	}


	
	private By Sign_inElem = By.cssSelector("DIV[aria-level='\\31 ']");

	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://login.microsoftonline.com/itfandango.onmicrosoft.com/wsfed?wa=wsignin1.0&wtrealm=spn%3a00000015-0000-0000-c000-000000000000&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f%253fcmp%253dUSMF%2526mi%253dDefaultDashboard&wct=2024-01-18T11%3a43%3a35Z&wreply=https%3a%2f%2fitf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com%2f&sso_reload=true";

        if (!currentUrl.equals("https://login.microsoftonline.com/itfandango.onmicrosoft.com/wsfed?wa=wsignin1.0&wtrealm=spn%3a00000015-0000-0000-c000-000000000000&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f%253fcmp%253dUSMF%2526mi%253dDefaultDashboard&wct=2024-01-18T11%3a43%3a35Z&wreply=https%3a%2f%2fitf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com%2f&sso_reload=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click Sign in
     * @name Click Sign in
     */
    public void Click_Sign_in()
    {
         
        WebElement elem = getWebElement(Sign_inElem);

        if (elem == null) {
            failStep("Click_Sign_in", "Click_Sign_in failed. Identifier Error: Unable to locate object: " + Sign_inElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Sign_in");    
        }

        m_Driver.switchTo().defaultContent();
    }
	public void GoToUrl()
	{
		m_Driver.get("https://login.microsoftonline.com/itfandango.onmicrosoft.com/wsfed?wa=wsignin1.0&wtrealm=spn%3a00000015-0000-0000-c000-000000000000&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f%253fcmp%253dUSMF%2526mi%253dDefaultDashboard&wct=2024-01-18T11%3a43%3a35Z&wreply=https%3a%2f%2fitf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com%2f&sso_reload=true");

		passStepWithScreenshot("Go to URL - https://login.microsoftonline.com/itfandango.onmicrosoft.com/wsfed?wa=wsignin1.0&wtrealm=spn%3a00000015-0000-0000-c000-000000000000&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f%253fcmp%253dUSMF%2526mi%253dDefaultDashboard&wct=2024-01-18T11%3a43%3a35Z&wreply=https%3a%2f%2fitf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com%2f&sso_reload=true");
	}
}