package StepDefinitions;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Util.TestBase;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.Properties;

public class LoginStepDef extends TestBase {
    public WebDriver driver;
     LoginPage loginPage;
Properties prop;
HomePage homePage;
    TestBase tb;

    @Given("user opens browser")
    public void user_opens_browser() throws InterruptedException {

        tb=new TestBase();
        tb.initialization();
         loginPage=new LoginPage(tb);
         homePage=new HomePage(tb);
         Thread.sleep(3000);
    }

    @Then("verify zoom login page title")
    public void verify_zoom_login_page_title()  {
        String actualTitle=loginPage.validateLoginPageTitle();
        String expectedTitle="Sign In | Zoom";
      // Assert.assertEquals(ExpectedTitle , title);
        if(actualTitle.equals(expectedTitle))
        {
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
    }
    @And("user enters username and password")
    public void user_enters_username_and_password(){
homePage=loginPage.login_details(prop.getProperty("username") ,prop.getProperty("password"));
	 }

@Then ("verify homepage title")
public  void verify_homepage_title() {
    String Title=homePage.homepageTitle();
  Assert.assertEquals("My Profile - Zoom" ,Title);
}
@Then("click on product page")
    public void click_on_product_page()
    {
        homePage.setProductLocator();
    }
@Then("close the browser")
public void close_the_browser(){
    driver.quit();
}

}
