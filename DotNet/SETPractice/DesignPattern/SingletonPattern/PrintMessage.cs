namespace DesignPattern.SingletonPattern
{
    public sealed class PrintMessage : IPrintMessage
    {
        private static readonly Lazy<PrintMessage> printMessage = new Lazy<PrintMessage>(() => new PrintMessage());
        public static PrintMessage print
        {
            get 
            { 
                return printMessage.Value; 
            }
        }

        private PrintMessage() 
        {
            Console.WriteLine("Printing Message");
        }
        
        public void Print(string message)
        {
            Console.WriteLine(message);
        }
    }
}
