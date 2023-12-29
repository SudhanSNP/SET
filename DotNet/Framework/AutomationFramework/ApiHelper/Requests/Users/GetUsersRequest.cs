using ApiHelper.Modal.Users;
using ApiHelper.Json;

namespace ApiHelper.Requests.Users
{
    public class GetUsersRequest : GetRequest
    {
        public GetUsersRequest(Dictionary<string, string> queryParam = null)
        {
            this.baseUrl = "https://reqres.in/api/users";
            this.queryParam = queryParam;
        }

        public GetUsersRequest BuildRequest()
        {
            SetRestClient();
            SetRequest();
            AddRequestHeader();
            AddQueryParameter();
            return this;
        }

        public async Task<UsersList> GetUsersDataList()
        {
            var response = await SendRequest();
            return await JsonHelper.JsonDeserializeAsync<UsersList>(response.Content);
        }
    }
}
