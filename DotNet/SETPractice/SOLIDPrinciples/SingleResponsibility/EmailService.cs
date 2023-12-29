using System.Net.Mail;

namespace SOLIDPrinciples.SingleResponsibility
{
    public class EmailService
    {
        SmtpClient smtpClient;
        public EmailService() 
        { 
            smtpClient = new SmtpClient();
        }

        public bool ValidateEmail(string email)
        {
            return email.Contains("@");
        }

        public void SendMessage(MailMessage message)
        {
            // smtpClient.Send(message);
            Console.WriteLine("Message Delivered!");
        }
    }
}
