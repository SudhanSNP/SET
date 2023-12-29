using System.Net.Mail;

namespace SOLIDPrinciples.SingleResponsibility
{
    public static class UserEmailBuilder
    {
        public static string from = "support@domain.com";
        public static MailMessage mailMessage;
        public static string NEW_RESGISTRATION_SUBJECT = "Hello, New Registration is Successfull";
        public static string NEW_RESGISTRATION_BODY = "New Registration is Successfull";

        public static MailMessage BuildNewRegistrationMessage(string email)
        {
            mailMessage = new MailMessage(from, email, NEW_RESGISTRATION_SUBJECT, NEW_RESGISTRATION_BODY);
            return mailMessage;
        }
    }
}
