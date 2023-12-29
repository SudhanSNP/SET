package SOLIDPrinciple.LiskovSubstitution;

public class SavingsAccount extends BankAccount{
    public double InterestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        InterestRate = interestRate;
    }

    @Override
    public void Withdraw(double amount) {
        if (amount <= Balance)
        {
            Balance -= amount;
            System.out.println("Remaining Balance in your Savings Account is " + Balance);
        }
        else
            System.out.println("Insufficient Balance in your Savings Account");
    }
}
