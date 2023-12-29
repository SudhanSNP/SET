using ApiHelper.ApiClient;
using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace ApiHelper.Requests
{
    public class PutRequest : RestSharpClient
    {
        protected void SetRequest()
        {
            SetRestRequest(RequestType.Put);
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
