﻿using ApiHelper.ApiClient;
using RestSharp;

namespace ApiHelper.Requests
{
    public class GetRequest : RestSharpClient
    {
        protected void SetRequest()
        {
            SetRestRequest(RequestType.Get);
        }
        protected void AddRequestHeader()
        {
            restRequest.AddHeader("Accept", "application/json");
        }

        protected void AddRequestBody<T>(T modal)
        {
            restRequest.AddBody(modal);
        }

        protected void AddQueryParameter()
        {
            if (queryParam != null && queryParam.Count >= 1)
            {
                foreach (KeyValuePair<string, string> param in queryParam)
                    restRequest.AddQueryParameter(param.Key, param.Value);
            }
        }
    }
}
