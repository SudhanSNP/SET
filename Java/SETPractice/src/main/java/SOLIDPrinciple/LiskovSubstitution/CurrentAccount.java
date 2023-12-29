package SOLIDPrinciple.LiskovSubstitution;

public class CurrentAccount extends BankAccount{
    public double OverdraftLimit;
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        OverdraftLimit = overdraftLimit;
    }

    @Override
    public void Withdraw(double amount) {
        if(amount <= Balance + OverdraftLimit)
        {
            Balance -= amount;
            System.out.println("Remaining Balance in your Current Account is " + Balance);
        }
        else
            System.out.println("Insufficient Balance in your Current Account");
    }
}
