namespace SOLIDPrinciples.LiskovSubstitution
{
    public class CurrentAccount : BankAccount
    {
        public decimal OverdraftLimit { get; set; }

        public CurrentAccount(string accountNumber, decimal balance, decimal overdraftLimit) : base(accountNumber, balance)
        {
            OverdraftLimit = overdraftLimit;
        }

        public override void Withdraw(decimal amount)
        {
            if(amount <= Balance + OverdraftLimit)
            {
                Balance -= amount;
                Console.WriteLine($"Remaining Balance in your Current Account is {Balance}");
            }
            else
                Console.WriteLine("Insufficient Balance in your Current Account");

        }
    }
}
