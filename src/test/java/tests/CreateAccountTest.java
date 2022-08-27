package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import models.NewAccountModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountViewPage;
import pages.AccountsPage;
import pages.LoginPage;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest{

    @Test
    @Description("User performs create account")
    @Severity(SeverityLevel.CRITICAL)
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driverManager.getDriver());
        loginPage.loginToSalesforce();
        AccountsPage accountsPage = new AccountsPage(driverManager.getDriver());
        NewAccountModel accountModel = PrepareNewAccountData.getValidData();
        accountsPage
                .openAccountsPage()
                .openNewAccountModal()
                .fillInAccountForm(accountModel);
        String initialAccountName = accountModel.getAccountName();
        AccountViewPage accountViewPage = new AccountViewPage(driverManager.getDriver());
        String resultAccountName = accountViewPage.getAccountName();
        Assert.assertEquals(initialAccountName, resultAccountName, "New account has incorrect name");
    }
}
