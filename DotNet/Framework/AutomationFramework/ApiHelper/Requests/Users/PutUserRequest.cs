using ApiHelper.Json;
using ApiHelper.Modal.Users;
using ApiHelper.Extentions;
using System.Net;

namespace ApiHelper.Requests.Users
{
    public class PutUserRequest : PutRequest
    {
        public HttpStatusCode ResponseCode { get; private set; }
        public PutUserRequest()
        {
            this.baseUrl = "https://reqres.in/api/users";
            this.queryParam = queryParam;
        }
        public PutUserRequest BuildRequest(UserData body)
        {
            baseUrl = baseUrl.AppendBaseUrl(body.Id.ToString());
            SetRestClient();
            SetRequest();
            AddRequestHeader();
            AddRequestBody(body);
            return this;
        }
        public async Task<UserData> PutUsersDataList()
        {
            var response = await SendRequest();
            ResponseCode = response.StatusCode;
            return await JsonHelper.JsonDeserializeAsync<UserData>(response.Content);
        }
    }
}
