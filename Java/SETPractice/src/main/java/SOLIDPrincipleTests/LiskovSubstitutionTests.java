package SOLIDPrincipleTests;

import SOLIDPrinciple.LiskovSubstitution.BankAccount;
import SOLIDPrinciple.LiskovSubstitution.CurrentAccount;
import SOLIDPrinciple.LiskovSubstitution.SavingsAccount;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LiskovSubstitutionTests extends TestBase {
    BankAccount bankAccount;
    SavingsAccount savingsAccount;
    CurrentAccount currentAccount;

    @Test(priority = 1, groups = {"SolidPrinciple"})
    public void SavingsAccountTest() {
        bankAccount = new SavingsAccount("SA1234", 15000, 0.5);
        bankAccount.Withdraw(1800);

        Assert.assertEquals(bankAccount.Balance, 13200);
    }

    @Test(priority = 2, groups = {"SolidPrinciple"})
    public void CurrentAccountTest() {
        bankAccount = new CurrentAccount("CA1234", 3000, 5000);
        bankAccount.Withdraw(10000);
        Assert.assertEquals(bankAccount.Balance, 3000);
    }
}
