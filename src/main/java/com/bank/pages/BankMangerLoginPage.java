package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankMangerLoginPage extends Utility {

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customers']")
    WebElement customerTab;


    public void clickOnAddCustomer() {

        clickOnElement(addCustomer);
        CustomListeners.test.log(Status.PASS,"click add customer");
        Reporter.log("add customer" + addCustomer.toString() + "<br>");

    }
    public void clickonOpenAccount()
    {
        clickOnElement(openAccount);
        CustomListeners.test.log(Status.PASS,"open account");
        Reporter.log("open account" + openAccount.toString() + "<br>");

    }
public void clickOnCustomerTab()

{
        clickOnElement(customerTab);
    CustomListeners.test.log(Status.PASS,"customer Tab");
    Reporter.log("customer Tab" + customerTab.toString() + "<br>");
}

}
