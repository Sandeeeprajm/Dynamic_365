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

// https://kprlogin.cloud.testinsights.io/app/#!/module-collection/guid/ceebce3c-1827-408c-802c-969bb57cfc32
@TestModellerModule(guid = "ceebce3c-1827-408c-802c-969bb57cfc32")
public class Sign_in_to_your_account_password extends BasePage
{
	public Sign_in_to_your_account_password (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier Sign_inElem = new WebIdentifier(By.xpath("//INPUT[@id='idSIButton9']"), 100031l);;

	private WebIdentifier passwdElem = new WebIdentifier(By.xpath("//INPUT[@id='i0118']"), 100030l);;


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://login.microsoftonline.com/common/oauth2/v2.0/authorize?client_id=4765445b-32c6-49b0-83e6-1d93765276ca&redirect_uri=https%3A%2F%2Fwww.office.com%2Flandingv2&response_type=code%20id_token&scope=openid%20profile%20https%3A%2F%2Fwww.office.com%2Fv2%2FOfficeHome.All&response_mode=form_post&nonce=638411688564869169.Y2U2ZTFlZGUtNGI3Yy00NGI3LWIwMmUtZjgxNGIxZTE4NjhiMTUwODAwMGEtNzQzZC00NThmLWE5ODMtYzc5ZmQxNjdlOGFl&ui_locales=en-US&mkt=en-US&login_hint=Emma.Beckett%40itfandango.onmicrosoft.com&client-request-id=2b2243e8-5330-43ae-b1c3-7eafe22ee49d&state=rWzY7SDM-oQHWjJINvl0fGv1JPbi326AyPDv_2pDOlpic9kdxAJu7BNsblO1uVYbpo5C2cMpwfzaYElEkgbz9L8xwgfiAvr4xvIEtLPKaQcSvI17iXXxHYDkSw9Yfb16mJwTVM4QjhR1UalFGuJ1ec9updjUFmekna7Foa0W2vgy-lE7teJaQyQCI46Oo8oNS2FGrXH316nJ1uRnV35dZPWXdKuEY4Ke0O0YePqQqAhi2a7NRUtLt6DBhdzDG8foXGyr3658Bp2ReS-Vda2o0QmMNdMTvDIL9ohITjmrAcVbM-Lqy6t1kQEhqTMp0xnRFKltmcCGrHzCCFv895iYKhjEXsKaXIFDYFHOiyb_dNl1fnKMTbO5EL3g9eIoAyIiPPuv0v3KShBBHr5YSVYeOQ&x-client-SKU=ID_NET6_0&x-client-ver=6.34.0.0";

        if (!currentUrl.equals("https://login.microsoftonline.com/common/oauth2/v2.0/authorize?client_id=4765445b-32c6-49b0-83e6-1d93765276ca&redirect_uri=https%3A%2F%2Fwww.office.com%2Flandingv2&response_type=code%20id_token&scope=openid%20profile%20https%3A%2F%2Fwww.office.com%2Fv2%2FOfficeHome.All&response_mode=form_post&nonce=638411688564869169.Y2U2ZTFlZGUtNGI3Yy00NGI3LWIwMmUtZjgxNGIxZTE4NjhiMTUwODAwMGEtNzQzZC00NThmLWE5ODMtYzc5ZmQxNjdlOGFl&ui_locales=en-US&mkt=en-US&login_hint=Emma.Beckett%40itfandango.onmicrosoft.com&client-request-id=2b2243e8-5330-43ae-b1c3-7eafe22ee49d&state=rWzY7SDM-oQHWjJINvl0fGv1JPbi326AyPDv_2pDOlpic9kdxAJu7BNsblO1uVYbpo5C2cMpwfzaYElEkgbz9L8xwgfiAvr4xvIEtLPKaQcSvI17iXXxHYDkSw9Yfb16mJwTVM4QjhR1UalFGuJ1ec9updjUFmekna7Foa0W2vgy-lE7teJaQyQCI46Oo8oNS2FGrXH316nJ1uRnV35dZPWXdKuEY4Ke0O0YePqQqAhi2a7NRUtLt6DBhdzDG8foXGyr3658Bp2ReS-Vda2o0QmMNdMTvDIL9ohITjmrAcVbM-Lqy6t1kQEhqTMp0xnRFKltmcCGrHzCCFv895iYKhjEXsKaXIFDYFHOiyb_dNl1fnKMTbO5EL3g9eIoAyIiPPuv0v3KShBBHr5YSVYeOQ&x-client-SKU=ID_NET6_0&x-client-ver=6.34.0.0")) {
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
      
	/**
 	 * Enter passwd
     * @name Enter passwd
     */
 	public void Enter_passwd(String passwd)
 	{
 	    
 		WebElement elem = getWebElement(passwdElem);

 		if (elem == null) {
            failStep("Enter_passwd", "Enter_passwd failed. Identifier Error: Unable to locate object: " + passwdElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.clear();
                elem.sendKeys(passwd);
            } catch (Exception e) {
    		    JavascriptExecutor jse = (JavascriptExecutor) m_Driver;
    		    jse.executeScript("arguments[0].value='" + passwd + "';", elem);
            }
    
      		passStep("Enter_passwd " + passwd);    
        }

 		m_Driver.switchTo().defaultContent();
 	}

	public void GoToUrl()
	{
		m_Driver.get("https://login.microsoftonline.com/common/oauth2/v2.0/authorize?client_id=4765445b-32c6-49b0-83e6-1d93765276ca&redirect_uri=https%3A%2F%2Fwww.office.com%2Flandingv2&response_type=code%20id_token&scope=openid%20profile%20https%3A%2F%2Fwww.office.com%2Fv2%2FOfficeHome.All&response_mode=form_post&nonce=638411688564869169.Y2U2ZTFlZGUtNGI3Yy00NGI3LWIwMmUtZjgxNGIxZTE4NjhiMTUwODAwMGEtNzQzZC00NThmLWE5ODMtYzc5ZmQxNjdlOGFl&ui_locales=en-US&mkt=en-US&login_hint=Emma.Beckett%40itfandango.onmicrosoft.com&client-request-id=2b2243e8-5330-43ae-b1c3-7eafe22ee49d&state=rWzY7SDM-oQHWjJINvl0fGv1JPbi326AyPDv_2pDOlpic9kdxAJu7BNsblO1uVYbpo5C2cMpwfzaYElEkgbz9L8xwgfiAvr4xvIEtLPKaQcSvI17iXXxHYDkSw9Yfb16mJwTVM4QjhR1UalFGuJ1ec9updjUFmekna7Foa0W2vgy-lE7teJaQyQCI46Oo8oNS2FGrXH316nJ1uRnV35dZPWXdKuEY4Ke0O0YePqQqAhi2a7NRUtLt6DBhdzDG8foXGyr3658Bp2ReS-Vda2o0QmMNdMTvDIL9ohITjmrAcVbM-Lqy6t1kQEhqTMp0xnRFKltmcCGrHzCCFv895iYKhjEXsKaXIFDYFHOiyb_dNl1fnKMTbO5EL3g9eIoAyIiPPuv0v3KShBBHr5YSVYeOQ&x-client-SKU=ID_NET6_0&x-client-ver=6.34.0.0");

		passStepWithScreenshot("Go to URL - https://login.microsoftonline.com/common/oauth2/v2.0/authorize?client_id=4765445b-32c6-49b0-83e6-1d93765276ca&redirect_uri=https%3A%2F%2Fwww.office.com%2Flandingv2&response_type=code%20id_token&scope=openid%20profile%20https%3A%2F%2Fwww.office.com%2Fv2%2FOfficeHome.All&response_mode=form_post&nonce=638411688564869169.Y2U2ZTFlZGUtNGI3Yy00NGI3LWIwMmUtZjgxNGIxZTE4NjhiMTUwODAwMGEtNzQzZC00NThmLWE5ODMtYzc5ZmQxNjdlOGFl&ui_locales=en-US&mkt=en-US&login_hint=Emma.Beckett%40itfandango.onmicrosoft.com&client-request-id=2b2243e8-5330-43ae-b1c3-7eafe22ee49d&state=rWzY7SDM-oQHWjJINvl0fGv1JPbi326AyPDv_2pDOlpic9kdxAJu7BNsblO1uVYbpo5C2cMpwfzaYElEkgbz9L8xwgfiAvr4xvIEtLPKaQcSvI17iXXxHYDkSw9Yfb16mJwTVM4QjhR1UalFGuJ1ec9updjUFmekna7Foa0W2vgy-lE7teJaQyQCI46Oo8oNS2FGrXH316nJ1uRnV35dZPWXdKuEY4Ke0O0YePqQqAhi2a7NRUtLt6DBhdzDG8foXGyr3658Bp2ReS-Vda2o0QmMNdMTvDIL9ohITjmrAcVbM-Lqy6t1kQEhqTMp0xnRFKltmcCGrHzCCFv895iYKhjEXsKaXIFDYFHOiyb_dNl1fnKMTbO5EL3g9eIoAyIiPPuv0v3KShBBHr5YSVYeOQ&x-client-SKU=ID_NET6_0&x-client-ver=6.34.0.0");
	}
}