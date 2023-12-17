package com.qa.Pages;

import com.qa.Util.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends TestBase {
 WebDriver driver;
 TestBase tb;

@FindBy(id="email")
WebElement emailLocator;
    @FindBy(id="password")
    WebElement passwordLocator;
    @FindBy(xpath="//div[@id=\\\"app\\\"]//a//img")
    WebElement zoomlogoLocator;
    @FindBy(id="js_btn_login")
    WebElement loginBtnLocator;
    @FindBy(xpath="//span[contains(text(),'Support')]")
    WebElement support;
//constructor
    public LoginPage(TestBase tb)
    {
        this.tb=tb;
        this.driver=tb.driver;
        PageFactory.initElements(driver,this);
    }
  public String validateLoginPageTitle()
  {
       return driver.getTitle();
  }
public void setSupport()
{
    support.click();
}
  public boolean zoom_logo()
    {
return zoomlogoLocator.isDisplayed();
    }

public HomePage login_details(String un,String pass)
{
    emailLocator.sendKeys(un);
    passwordLocator.sendKeys(pass);
    loginBtnLocator.click();
    return new HomePage(tb);


}

}
