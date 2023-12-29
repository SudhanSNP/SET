namespace ApiHelper.Modal.Users
{
    public class UserDataBuilder
    {
        UserData User { get; set; }

        public UserDataBuilder()
        {
            User = new UserData();
        }

        public UserDataBuilder WithUserId(int id)
        {
            User.Id = id;
            return this;
        }

        public UserDataBuilder WithName(string name)
        {
            User.Name = name;
            return this;
        }

        public UserDataBuilder WithJob(string job)
        {
            User.Job = job;
            return this;
        }

        public UserData Build()
        {
            return User;
        }
    }
}
