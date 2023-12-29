using ApiHelper.Modal.Users;
using ApiHelper.Requests.Users;
using NUnit.Framework;
using System.Net;

namespace Tests.ApiTests
{
    [TestFixture]
    public class UpdateUserTest
    {
        [Test]
        public async Task UpdateUser()
        {
            UserData user = new UserDataBuilder()
                .WithUserId(2)
                .WithName("Sudhan")
                .WithJob("Software Engineer in Test")
                .Build();

            var response = await new PutUserRequest()
                .BuildRequest(user)
                .PutUsersDataList();

            Assert.AreEqual(response.Name, user.Name);
            Assert.AreEqual(response.Job, user.Job);
        }
    }
}