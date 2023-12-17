package com.qa.Pages;

import com.qa.Util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
 WebDriver driver;
    TestBase tb;
    @FindBy(id="btnNewProducts")
    WebElement productLocator;
    @FindBy(id="//li[@class='productSubSection']//div//a[contains(text(),\\\"Team Chat\\\")]")
    WebElement teamchatLocator;
    @FindBy(id="btnNewSolutions")
    WebElement solutionLocator;
    public HomePage(TestBase tb)
    {
        this.tb=tb;
        this.driver=tb.driver;
        PageFactory.initElements(driver,this);
    }
public  String homepageTitle()
{
    return driver.getTitle();
}

    public ProductPage setProductLocator()
    {
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement((By) productLocator)).moveToElement(driver.findElement((By) teamchatLocator)).build().perform();
        return  new ProductPage();
    }

}
