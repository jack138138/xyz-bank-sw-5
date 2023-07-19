package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
@CacheLookup
@FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

@CacheLookup
@FindBy(xpath = "//input[@placeholder='Last Name']")
WebElement lastName;

@CacheLookup
@FindBy (xpath = "//input[@placeholder='Post Code']")
WebElement postCode;
@CacheLookup
@FindBy (xpath = "//button[@type='submit']")
WebElement addCustomerButton;






    public void enterFirstName(String firstname){

        sendTextToElement(firstName, firstname);
        CustomListeners.test.log(Status.PASS,"enter firstname");
        Reporter.log("enter firstname" + firstName.toString() + "<br>");

    }

    public void enterLastName(String lastname)
    {
        sendTextToElement( lastName,lastname);
        CustomListeners.test.log(Status.PASS,"enter lastname");
        Reporter.log("enter lastname" + lastName.toString() + "<br>");


    }

    public void enterpostCode(String postCOde){


        sendTextToElement(postCode, "ABC 1CD");
        CustomListeners.test.log(Status.PASS,"enter postcode");
        Reporter.log("enter postcode" + postCode.toString() + "<br>");
    }


    public void clickOnAddCustomerButton(){


        clickOnElement(addCustomerButton);
        CustomListeners.test.log(Status.PASS,"enter lastname");
        Reporter.log("enter lastname" + addCustomerButton.toString() + "<br>");
    }


    public void verifyAlertText(){


        String actual = getAlertText();
        String expected = "Customer added successfully with customer id :6";
        Assert.assertEquals(expected, actual, "incorrect text");
        CustomListeners.test.log(Status.PASS,"verify alert text");
        Reporter.log("verify alert text" + getAlertText().toString() + "<br>");
    }


    public void clickOkOnPopUp() {

        acceptAlert();

    }
}