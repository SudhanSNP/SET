namespace SOLIDPrinciples.SingleResponsibility
{
    public class User
    {
        public string UserName { get; set; }
        public string Password { get; set; }
        public string Email { get; set; }

        public User(string userName, string password, string email) 
        {
            this.UserName = userName;
            this.Password = password;
            this.Email = email;
        }
    }
}
