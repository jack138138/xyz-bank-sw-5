package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
@CacheLookup
@FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchJack;
@CacheLookup
@FindBy(xpath = "//button[contains(text(),'Login')]")
WebElement login;

@CacheLookup
@FindBy(xpath = "//button[contains(text(),'Logout')]")
WebElement logout;

@CacheLookup
@FindBy(xpath = "//label[contains(text(),'Your Name :')]")
WebElement verifyYourName;


    public void searchJack3(){
        selectByVisibleTextFromDropDown(searchJack, "Harry Potter");
        CustomListeners.test.log(Status.PASS,"Search client");
        Reporter.log("Search client" + searchJack.toString() + "<br>");

    }

    public void clickOnLogin3(){
        clickOnElement(login);
        CustomListeners.test.log(Status.PASS,"click on login");
        Reporter.log("enter lastname" + login.toString() + "<br>");

    }

    public void verifyLogOutTab() throws InterruptedException {
        Thread.sleep(2000);
        String expected = "Logout";

        String actual = getTextFromElement(logout);

        Assert.assertEquals(actual, expected, "Not Displayed Logout Tab");
        CustomListeners.test.log(Status.PASS,"verify logout");
        Reporter.log("verify logout" + logout.toString() + "<br>");

    }

    public void clickonLogout()

    {
        clickOnElement(logout);
        CustomListeners.test.log(Status.PASS,"click on logout");
        Reporter.log("click on log out" + logout.toString() + "<br>");
    }
    public void verifyyourNameDisplay(){

       String expectedYourName = "Your Name :";
       String actualYourNAme = getTextFromElement(verifyYourName);
       Assert.assertEquals(actualYourNAme, expectedYourName, "Wrong Displayed");
        CustomListeners.test.log(Status.PASS,"verify name display");
        Reporter.log("verify your name" + verifyYourName.toString() + "<br>");
    }





}


