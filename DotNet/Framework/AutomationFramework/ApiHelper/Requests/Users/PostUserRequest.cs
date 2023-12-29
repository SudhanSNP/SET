using ApiHelper.Json;
using ApiHelper.Modal.Users;
using System.Net;

namespace ApiHelper.Requests.Users
{
    public class PostUserRequest : PostRequest
    {
        public HttpStatusCode ResponseCode { get; private set; }
        public PostUserRequest()
        {
            this.baseUrl = "https://reqres.in/api/users";
            this.queryParam = queryParam;
        }
        public PostUserRequest BuildRequest(UserData body)
        {
            SetRestClient();
            SetRequest();
            AddRequestHeader();
            AddRequestBody(body);
            return this;
        }
        public async Task<UserData> PostUsersDataList()
        {
            var response = await SendRequest();
            ResponseCode = response.StatusCode;
            return await JsonHelper.JsonDeserializeAsync<UserData>(response.Content);
        }
    }
}
