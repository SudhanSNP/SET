using System.Net.Mail;

namespace SOLIDPrinciples.SingleResponsibility
{
    public class MessageService
    {
        public MailMessage message;

        public MessageService() { }

        public MailMessage FormMailMessage(string fromMail, string toMail, string? emailSubject, string? emailBody)
        {
            message = new MailMessage(fromMail, toMail, emailSubject, emailBody);
            return message;
        }
    }
}
