package SOLIDPrincipleTests;

import SOLIDPrinciple.SingleResponsibility.EmailService;
import SOLIDPrinciple.SingleResponsibility.User;
import SOLIDPrinciple.SingleResponsibility.UserService;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingleResponsibilityTests extends TestBase {
    EmailService emailService;
    UserService userService;

    @BeforeMethod
    public void SetUp() {
        emailService = new EmailService();
        userService = new UserService(emailService);
    }

    @Test(groups = {"SolidPrinciple"})
    public void UserServiceTest() throws Exception {
        String username = "Sudhan";
        String password = "test@123";
        String email = "test@mail.com";

        User newUser = userService.RegisterUser(username, password, email);

        Assert.assertEquals(newUser.UserName, "Sudhan");
    }
}
