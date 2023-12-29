package SOLIDPrinciple.LiskovSubstitution;

public class BankAccount {
    public String AccountNumber;
    public double Balance;

    public BankAccount(String accountNumber, double balance) {
        AccountNumber = accountNumber;
        Balance = balance;
    }

    public void Deposit(double amount) {
        Balance += amount;
    }

    public void Withdraw(double amount) {
        if(amount < Balance)
            Balance -= amount;
        else
            System.out.println("Insufficient balance.");
    }
}
