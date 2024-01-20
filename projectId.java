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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/b31f82ef-d6a3-4d81-9827-ae3ae70cb93d
@TestModellerModule(guid = "b31f82ef-d6a3-4d81-9827-ae3ae70cb93d")
public class projectId extends BasePage
{
	public projectId (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier project_dropdownElem = new WebIdentifier(By.xpath("/html/body/div[2]/div/div[7]/div[2]/div/div[5]/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/div[4]/div[2]/div/div/div"), 100057l);;

	private WebIdentifier Project_nameElem = new WebIdentifier(By.xpath("/html/body/form/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/input"), 100058l);;


	
     
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
 	 * DoubleClick project dropdown
     * @name DoubleClick project dropdown
     */
	public void DoubleClick_project_dropdown()
	{
	    (new pages.WebGeneralActionsFunctions(m_Driver)).DoubleClick(project_dropdownElem);
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