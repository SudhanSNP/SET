namespace SOLIDPrinciples.SingleResponsibility
{
    public class UserService
    {
        public EmailService emailService;
        public User user;
        public UserService(EmailService emailService) 
        {
            this.emailService = emailService;
        }

        public User RegisterUser(string username, string password, string email)
        {
            if (!emailService.ValidateEmail(email))
                throw new Exception("Invalid Email Address");
            user = new User(username, password, email);
            var message = UserEmailBuilder.BuildNewRegistrationMessage(email);
            emailService.SendMessage(message);
            Console.WriteLine("User Registered Successfully!");
            return user;
        }

    }
}
