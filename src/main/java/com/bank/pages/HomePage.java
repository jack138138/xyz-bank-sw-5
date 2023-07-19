package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogin;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
            WebElement customerLogin;




public void clickOnBankManagerLogin()

{
    clickOnElement(bankManagerLogin);
    CustomListeners.test.log(Status.PASS,"click on Bank Manager Login");
    Reporter.log("click on Bank Manager login" + bankManagerLogin.toString() + "<br>");
}
public void clickOnCustomerLogin()
{
    clickOnElement(customerLogin);
    CustomListeners.test.log(Status.PASS,"click on customer login");
    Reporter.log("click on log out" + customerLogin.toString() + "<br>");

}

}
