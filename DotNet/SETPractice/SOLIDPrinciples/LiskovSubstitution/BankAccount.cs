namespace SOLIDPrinciples.LiskovSubstitution
{
    public class BankAccount
    {
        public string AccountNumber { get; set; }
        public decimal Balance { get; set; }

        public BankAccount(string accountNumber, decimal balance) 
        {
            AccountNumber = accountNumber;
            Balance = balance;
        }

        public virtual void Deposit(decimal amount)
        {
            Balance += amount;
            Console.WriteLine($"Account balance: {Balance}");
        }

        public virtual void Withdraw(decimal amount)
        {
            if (amount < Balance)
                Balance -= amount;
            else
                Console.WriteLine("Insufficient balance.");
        }
    }
}
