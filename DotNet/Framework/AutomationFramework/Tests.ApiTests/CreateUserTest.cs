using ApiHelper.Modal.Users;
using ApiHelper.Requests.Users;
using NUnit.Framework;
using System.Net;

namespace Tests.ApiTests
{
    [TestFixture]
    public class CreateUserTest
    {
        [Test] 
        public async Task CreateUser()
        {
            UserData user = new UserDataBuilder()
                .WithName("Sudhan")
                .WithJob("Software Engineer in Test")
                .Build();

            var response = await new PostUserRequest()
                .BuildRequest(user)
                .PostUsersDataList();

            Assert.AreEqual(response.Name, user.Name);
            Assert.AreEqual(response.Job, user.Job);
        }
    }
}