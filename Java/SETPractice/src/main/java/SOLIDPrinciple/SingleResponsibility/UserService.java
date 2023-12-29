package SOLIDPrinciple.SingleResponsibility;

public class UserService {
    public EmailService emailService;
    public User user;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public User RegisterUser(String userName, String password, String email) throws Exception {
        if(!emailService.ValidateEmail(email))
            throw new Exception("Invalid Email Address");
        user = new User(userName, password, email);
        emailService.SendEmail("User Registered Successfully!");
        return user;
    }
}
