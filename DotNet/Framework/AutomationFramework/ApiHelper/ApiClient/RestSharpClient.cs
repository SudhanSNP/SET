using RestSharp;

namespace ApiHelper.ApiClient
{
    public abstract class RestSharpClient : IRestSharpClient
    {
        
        protected string baseUrl { get; set; }
        public Dictionary<string, string> queryParam { get; set; } 

        public RestClient restClient { get; set; }
        public RestRequest restRequest { get; set; }
        public RestResponse restResponse { get; set; }

        public void SetRestClient()
        {
            restClient = new RestClient(baseUrl);
        }

        public void SetRestRequest(RequestType type)
        {
            restRequest = RestSharpFactory.GetRestRequest(baseUrl, type);
        }

        public void SetRestResponse()
        {
            this.restResponse = new RestResponse();
        }

        protected async Task<RestResponse> SendRequest()
        {
            restResponse = await restClient.ExecuteAsync(restRequest);
            return restResponse;
        }
    }
}
