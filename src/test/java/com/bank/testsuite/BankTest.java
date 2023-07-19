package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {

HomePage homepage = new HomePage();
AddCustomerPage addCustomerPage = new AddCustomerPage();

OpenAccountPage openaccountpage = new OpenAccountPage();

BankMangerLoginPage bankMangerLoginPage = new BankMangerLoginPage();

CustomerLoginPage customerLoginPage = new CustomerLoginPage();

CustomersPage customersPage = new CustomersPage();


 @Test(groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully () throws InterruptedException {
        homepage.clickOnBankManagerLogin();
        bankMangerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName("Jack");
        addCustomerPage.enterLastName("spawrrow");
        addCustomerPage.enterpostCode("658225");
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.verifyAlertText();
        addCustomerPage.clickOkOnPopUp();

    }

    @Test(groups = {"sanity", "smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully(){
    homepage.clickOnBankManagerLogin();
    openaccountpage.clickOnOpenAccountPage();
    openaccountpage.searchCustomerJack();
    openaccountpage.selectCurrancy();
    openaccountpage.clickOnProcessButton();
    openaccountpage.verifyAlertMessag2();
    openaccountpage.clickOkOnPopUp();
    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
    homepage.clickOnCustomerLogin();
    customerLoginPage.searchJack3();
    customerLoginPage.clickOnLogin3();
    customerLoginPage.verifyLogOutTab();
    customerLoginPage.clickonLogout();
    customerLoginPage.verifyyourNameDisplay();

    }
    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully (){
    homepage.clickOnCustomerLogin();
    customerLoginPage.searchJack3();
    customerLoginPage.clickOnLogin3();
    customersPage.clickOnDepositTab();
    customersPage.enterAmount();
    customersPage.clickOnDepositButton();
    customersPage.verifyDeposit();

    }
    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully(){
        homepage.clickOnCustomerLogin();
        customerLoginPage.searchJack3();
        customerLoginPage.clickOnLogin3();
        customersPage.clickOnWithdrawTab();
        customersPage.enterWithdrawalAmount();
        customersPage.clickOnwithdrawalButton();
        customersPage.verifywithdrawalText();



    }



    }

