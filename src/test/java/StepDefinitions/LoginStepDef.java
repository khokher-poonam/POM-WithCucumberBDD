package StepDefinitions;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Util.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginStepDef extends TestBase {
    static WebDriver driver=null;
     LoginPage loginPage=new LoginPage(driver);
Properties prop;
HomePage homePage;




    @Given("user opens browser")
    public void user_opens_browser() throws InterruptedException {
       TestBase.initialization();
//         loginPage=new LoginPage(driver);

        Thread.sleep(3000);
    }

//    @Then ("click on supportpage")
//    public void click_on_supportpage()
//    {
//        loginPage=new LoginPage(driver);
//        loginPage.setSupport();
//    }


    @Then("user is on zoom login page")
    public void user_is_on_zoom_login_page() throws InterruptedException {
    loginPage=new LoginPage(driver);
       String title=loginPage.validateloginpageTitle();
       Assert.assertEquals("Sign In | Zoom" , title);
    }
    @Then("user enters username and password")
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
