using RestSharp;
using ApiHelper.ApiClient;
using System.Net;

namespace ApiHelper.Requests
{
    public class PostRequest : RestSharpClient
    {
        protected void SetRequest()
        {
            SetRestRequest(RequestType.Post);
        }
        protected void AddRequestHeader()
        {
            restRequest.AddHeader("Content-Type", "application/json");
            restRequest.AddHeader("Accept", "application/json");
        }
        protected void AddRequestBody<T>(T modal)
        {
            restRequest.AddBody(modal);
        }

        protected HttpStatusCode GetStatusCode()
        {
            return restResponse.StatusCode;
        }
    }
}
