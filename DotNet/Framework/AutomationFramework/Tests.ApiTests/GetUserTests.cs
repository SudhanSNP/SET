using ApiHelper.Modal.Users;
using ApiHelper.Requests.Users;
using NUnit.Framework;

namespace Tests.ApiTests
{
    [TestFixture]
    public class GetUserTests
    {
        [Test]
        public async Task GetUser()
        {
            List<string> expectedNames = new List<string> { "George", "Janet", "Emma", "Eve", "Charles", "Tracey" };

            UsersList Users = await new GetUsersRequest()
                .BuildRequest()
                .GetUsersDataList();

            List<string> actualNames = Users.Data.Select(usr => usr.FirstName).ToList();

            Assert.AreEqual(expectedNames, actualNames);

            expectedNames = new List<string> { "Michael", "Lindsay", "Tobias", "Byron", "George", "Rachel" };

            Users = await new GetUsersRequest(new Dictionary<string, string> { { "page", "2" } })
                .BuildRequest()
                .GetUsersDataList();

            actualNames = Users.Data.Select(usr => usr.FirstName).ToList();

            Assert.AreEqual(expectedNames, actualNames);
        }
    }
}
