package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {


@CacheLookup
@FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountPage;
@CacheLookup
@FindBy (xpath = "//select[@id='userSelect']")
WebElement searchCustomer;

@CacheLookup
@FindBy(xpath = "//select[@id='currency']")
WebElement currancy;


@CacheLookup
@FindBy(xpath = "//button[contains(text(),'Process')]")
WebElement process;




    public void clickOnOpenAccountPage()


    {
        clickOnElement(openAccountPage);
        CustomListeners.test.log(Status.PASS,"click on open account page");
        Reporter.log("click on log out" + openAccountPage.toString() + "<br>");
    }

    public void searchCustomerJack()

    {

        selectByVisibleTextFromDropDown(searchCustomer,"Harry Potter");
        CustomListeners.test.log(Status.PASS,"search customer");
        Reporter.log("search customer" + searchCustomer.toString() + "<br>");
    }

    public void selectCurrancy(){

        selectByVisibleTextFromDropDown(currancy, "Pound");
        CustomListeners.test.log(Status.PASS,"select currancy");
        Reporter.log("select currancy" + currancy.toString() + "<br>");

    }
    public void clickOnProcessButton()
    {
        clickOnElement(process);
        CustomListeners.test.log(Status.PASS,"click On Process Button");
        Reporter.log("click on Process Button" + process.toString() + "<br>");
    }

    public void verifyAlertMessag2() {

        String actual = getAlertText();
        String expected = "Account created successfully with account Number :1016";

        Assert.assertEquals(expected, actual, "incorrect text");
        CustomListeners.test.log(Status.PASS,"verify alert Message");
      //  Reporter.log("verify Alert Message" + .toString() + "<br>");
    }
    public void clickOkOnPopUp() {
        acceptAlert();


    }

}
