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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/6f4ae72a-f756-41e6-b0e3-883946ea6889
@TestModellerModule(guid = "6f4ae72a-f756-41e6-b0e3-883946ea6889")
public class Sign_in_to_your_account extends BasePage
{
	public Sign_in_to_your_account (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier NextElem = new WebIdentifier(By.xpath("//INPUT[@id='idSIButton9']"), 100029l);;

	private WebIdentifier loginfmtElem = new WebIdentifier(By.xpath("//INPUT[@id='i0116']"), 100028l);;


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://login.microsoftonline.com/common/oauth2/authorize?client_id=ebf6b2b7-c635-4217-b6b7-21de4ac65764&response_type=code%20id_token&scope=openid%20profile%20email%20offline_access&state=OpenIdConnect.AuthenticationProperties%3DZOZzFGkcMiGxPqdiD7KlXdw8sfnHAyN0aeLxpXKOPnPSRC6ANJj_9lEr_1hoQC-xL9gbu6xFu8hI_xnlV4LxJmEFdqqzCE7dgBTKMzfPyXBAapxm4jPIiCk7_wzQin6AuZ6iChNSk_Gqqdn2G1iH3vKH-kUREkUEEmz_E2yRf2RyylESC2WVIpBpsngompyH&response_mode=form_post&nonce=638411685168351413.MmFmODU4YzktOTMwNC00YjQxLTk0ODYtZTZjYTJhMjg2OTMzZTM5ZDA1MzEtNDE4Mi00NDg0LWI4NGItY2E0YzFkZDZkZmJm&prompt=login&redirect_uri=https%3A%2F%2Fdynamics.microsoft.com%2F&post_logout_redirect_uri=https%3A%2F%2Fdynamics.microsoft.com&x-client-SKU=ID_NET472&x-client-ver=6.32.1.0";

        if (!currentUrl.equals("https://login.microsoftonline.com/common/oauth2/authorize?client_id=ebf6b2b7-c635-4217-b6b7-21de4ac65764&response_type=code%20id_token&scope=openid%20profile%20email%20offline_access&state=OpenIdConnect.AuthenticationProperties%3DZOZzFGkcMiGxPqdiD7KlXdw8sfnHAyN0aeLxpXKOPnPSRC6ANJj_9lEr_1hoQC-xL9gbu6xFu8hI_xnlV4LxJmEFdqqzCE7dgBTKMzfPyXBAapxm4jPIiCk7_wzQin6AuZ6iChNSk_Gqqdn2G1iH3vKH-kUREkUEEmz_E2yRf2RyylESC2WVIpBpsngompyH&response_mode=form_post&nonce=638411685168351413.MmFmODU4YzktOTMwNC00YjQxLTk0ODYtZTZjYTJhMjg2OTMzZTM5ZDA1MzEtNDE4Mi00NDg0LWI4NGItY2E0YzFkZDZkZmJm&prompt=login&redirect_uri=https%3A%2F%2Fdynamics.microsoft.com%2F&post_logout_redirect_uri=https%3A%2F%2Fdynamics.microsoft.com&x-client-SKU=ID_NET472&x-client-ver=6.32.1.0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click Next
     * @name Click Next
     */
    public void Click_Next()
    {
         
        WebElement elem = getWebElement(NextElem);

        if (elem == null) {
            failStep("Click_Next", "Click_Next failed. Identifier Error: Unable to locate object: " + NextElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Next");    
        }

        m_Driver.switchTo().defaultContent();
    }
      
	/**
 	 * Enter loginfmt
     * @name Enter loginfmt
     */
 	public void Enter_loginfmt(String loginfmt)
 	{
 	    
 		WebElement elem = getWebElement(loginfmtElem);

 		if (elem == null) {
            failStep("Enter_loginfmt", "Enter_loginfmt failed. Identifier Error: Unable to locate object: " + loginfmtElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.clear();
                elem.sendKeys(loginfmt);
            } catch (Exception e) {
    		    JavascriptExecutor jse = (JavascriptExecutor) m_Driver;
    		    jse.executeScript("arguments[0].value='" + loginfmt + "';", elem);
            }
    
      		passStep("Enter_loginfmt " + loginfmt);    
        }

 		m_Driver.switchTo().defaultContent();
 	}

	public void GoToUrl()
	{
		m_Driver.get("https://login.microsoftonline.com/common/oauth2/authorize?client_id=ebf6b2b7-c635-4217-b6b7-21de4ac65764&response_type=code%20id_token&scope=openid%20profile%20email%20offline_access&state=OpenIdConnect.AuthenticationProperties%3DZOZzFGkcMiGxPqdiD7KlXdw8sfnHAyN0aeLxpXKOPnPSRC6ANJj_9lEr_1hoQC-xL9gbu6xFu8hI_xnlV4LxJmEFdqqzCE7dgBTKMzfPyXBAapxm4jPIiCk7_wzQin6AuZ6iChNSk_Gqqdn2G1iH3vKH-kUREkUEEmz_E2yRf2RyylESC2WVIpBpsngompyH&response_mode=form_post&nonce=638411685168351413.MmFmODU4YzktOTMwNC00YjQxLTk0ODYtZTZjYTJhMjg2OTMzZTM5ZDA1MzEtNDE4Mi00NDg0LWI4NGItY2E0YzFkZDZkZmJm&prompt=login&redirect_uri=https%3A%2F%2Fdynamics.microsoft.com%2F&post_logout_redirect_uri=https%3A%2F%2Fdynamics.microsoft.com&x-client-SKU=ID_NET472&x-client-ver=6.32.1.0");

		passStepWithScreenshot("Go to URL - https://login.microsoftonline.com/common/oauth2/authorize?client_id=ebf6b2b7-c635-4217-b6b7-21de4ac65764&response_type=code%20id_token&scope=openid%20profile%20email%20offline_access&state=OpenIdConnect.AuthenticationProperties%3DZOZzFGkcMiGxPqdiD7KlXdw8sfnHAyN0aeLxpXKOPnPSRC6ANJj_9lEr_1hoQC-xL9gbu6xFu8hI_xnlV4LxJmEFdqqzCE7dgBTKMzfPyXBAapxm4jPIiCk7_wzQin6AuZ6iChNSk_Gqqdn2G1iH3vKH-kUREkUEEmz_E2yRf2RyylESC2WVIpBpsngompyH&response_mode=form_post&nonce=638411685168351413.MmFmODU4YzktOTMwNC00YjQxLTk0ODYtZTZjYTJhMjg2OTMzZTM5ZDA1MzEtNDE4Mi00NDg0LWI4NGItY2E0YzFkZDZkZmJm&prompt=login&redirect_uri=https%3A%2F%2Fdynamics.microsoft.com%2F&post_logout_redirect_uri=https%3A%2F%2Fdynamics.microsoft.com&x-client-SKU=ID_NET472&x-client-ver=6.32.1.0");
	}
}