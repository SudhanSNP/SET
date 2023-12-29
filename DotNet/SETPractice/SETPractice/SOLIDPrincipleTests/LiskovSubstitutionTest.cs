using NUnit.Framework;
using SOLIDPrinciples.LiskovSubstitution;

namespace SETPractice.SOLIDPrincipleTests
{
    [TestFixture]
    public class LiskovSubstitutionTest
    {
        BankAccount bankAccount;
        SavingsAccount savingsAccount;
        CurrentAccount currentAccount;

        [Test]
        public void LiskovSubstitutionPrincipleTest()
        {
            bankAccount = new SavingsAccount("SA1234", 15000, 0.5m);
            bankAccount.Withdraw(1800);

            bankAccount = new CurrentAccount("CA1234", 3000, 5000);
            bankAccount.Withdraw(10000);
        }
    }
}
