package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class CustomersPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositTab;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement depoitAmount;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifyDeposit;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawal;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withdrawalAmount;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withdrawalbutton;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement verifywithdraw;


    public void clickOnDepositTab() {

        clickOnElement(depositTab);
        CustomListeners.test.log(Status.PASS,"click on deposit");
        Reporter.log("click on deposit" + depositTab.toString() + "<br>");

    }

    public void enterAmount() {
        sendTextToElement(depoitAmount, "100");
        CustomListeners.test.log(Status.PASS,"enter amount");
        Reporter.log("enter amount" + depoitAmount.toString() + "<br>");

    }

    public void clickOnDepositButton() {

        clickOnElement(depositButton);
        CustomListeners.test.log(Status.PASS,"deposit button");
        Reporter.log("deposit button" + depositButton.toString() + "<br>");
    }

    public void verifyDeposit() {
        String expectedDeposit = "Deposit Successful";
        String actualDeposit = getTextFromElement(verifyDeposit);
        Assert.assertEquals(actualDeposit, expectedDeposit, "Not Matcheing Text");
        CustomListeners.test.log(Status.PASS,"verify deposit");
        Reporter.log("deposit verify" + verifyDeposit.toString() + "<br>");

    }

    public void clickOnWithdrawTab() {
        clickOnElement(withdrawal);
        CustomListeners.test.log(Status.PASS,"click on withdrawal");
        Reporter.log("click on withdrawal" + withdrawal.toString() + "<br>");
    }

    public void enterWithdrawalAmount() {
        sendTextToElement(withdrawalAmount, "50");
        CustomListeners.test.log(Status.PASS,"enter withdrawal amount");
        Reporter.log("enter withdrawal amount" + withdrawalAmount.toString() + "<br>");
    }

    public void clickOnwithdrawalButton() {

        clickOnElement(withdrawalbutton);
        CustomListeners.test.log(Status.PASS,"withdrawal button");
        Reporter.log("withdrawal amount" + withdrawalbutton.toString() + "<br>");
    }

    public void verifywithdrawalText() {
        String expectedWithdrawal = "Transaction Successful";
        String actualWithdral = getTextFromElement(verifywithdraw);
        Assert.assertEquals(actualWithdral, expectedWithdrawal, "Not Matching Withdrawal");
        CustomListeners.test.log(Status.PASS,"verify withdrawal text");
        Reporter.log("verify withdrawal text" + verifywithdraw.toString() + "<br>");
    }


}
