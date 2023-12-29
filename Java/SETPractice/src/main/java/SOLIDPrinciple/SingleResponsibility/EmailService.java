package SOLIDPrinciple.SingleResponsibility;

public class EmailService {

    public boolean ValidateEmail(String email) {
        return email.contains("@");
    }

    public void SendEmail(String message) {
        System.out.println(message);
        System.out.println("Email delivered successfully!");
    }
}
