package SOLIDPrinciple.SingleResponsibility;

public class User {
    public String UserName;
    public String Password;
    public String Email;

    public User(String userName, String password, String email) {
        this.UserName = userName;
        this.Password = password;
        this.Email = email;
    }
}
