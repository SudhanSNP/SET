namespace SOLIDPrinciples.LiskovSubstitution
{
    public class SavingsAccount : BankAccount
    {
        public decimal InterestRate { get; set; }

        public SavingsAccount(string accountNumber, decimal balance, decimal interestRate) : base(accountNumber, balance)
        {
            InterestRate = interestRate;
        }

        public override void Withdraw(decimal amount)
        {
            if (amount <= Balance)
            {
                Balance -= amount;
                Console.WriteLine($"Remaining Balance in your Savings Account is {Balance}");
            }
            else
                Console.WriteLine("Insufficient Balance in your Savings Account");
        }
    }
}
