package tests;

import models.NewAccountModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountViewPage;
import pages.AccountsPage;
import pages.LoginPage;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest{

    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToSalesforce();
        AccountsPage accountsPage = new AccountsPage(driver);
        NewAccountModel accountModel = PrepareNewAccountData.getValidData();
        accountsPage
                .openAccountsPage()
                .openNewAccountModal()
                .fillInAccountForm(accountModel);
        String initialAccountName = accountModel.getAccountName();
        AccountViewPage accountViewPage = new AccountViewPage(driver);
        String resultAccountName = accountViewPage.getAccountName();
        Assert.assertEquals(initialAccountName, resultAccountName, "New account has incorrect name");
    }
}
