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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/78036c00-0646-43cf-925c-48442b72640d
@TestModellerModule(guid = "78036c00-0646-43cf-925c-48442b72640d")
public class site_dropdown extends BasePage
{
	public site_dropdown (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier UnknownElem = new WebIdentifier(By.xpath("//label[normalize-space()= 'Site']/../div/div"), 100050l);;

	private WebIdentifier Unknown_1Elem = new WebIdentifier(By.xpath("//label[normalize-space()= 'Warehouse']/../div/div"), 100051l);;


	
     
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
 	 * DoubleClick 
     * @name DoubleClick 
     */
	public void DoubleClick_Unknown()
	{
	    (new pages.WebGeneralActionsFunctions(m_Driver)).DoubleClick(UnknownElem);
	}
	
    
	/**
 	 * DoubleClick 
     * @name DoubleClick 
     */
	public void DoubleClick_Unknown_1()
	{
	    (new pages.WebGeneralActionsFunctions(m_Driver)).DoubleClick(Unknown_1Elem);
	}
	
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}
}