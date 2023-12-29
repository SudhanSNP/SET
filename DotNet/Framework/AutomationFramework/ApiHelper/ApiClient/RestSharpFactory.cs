using RestSharp;

namespace ApiHelper.ApiClient
{
    public static class RestSharpFactory
    {
        public static RestRequest restRequest { get; set; }

        public static RestRequest GetRestRequest(string baseUrl, RequestType type)
        {
            switch (type)
            {
                case RequestType.Get:
                    restRequest = new RestRequest(baseUrl, Method.Get);
                    break;
                case RequestType.Post:
                    restRequest = new RestRequest(baseUrl, Method.Post);
                    break;
                case RequestType.Put:
                    restRequest = new RestRequest(baseUrl, Method.Put);
                    break;
                case RequestType.Delete:
                    restRequest = new RestRequest(baseUrl, Method.Delete);
                    break;
                default:
                    throw new ArgumentException("Enter a valid Request type");
            }

            return restRequest;
        }
    }
}
