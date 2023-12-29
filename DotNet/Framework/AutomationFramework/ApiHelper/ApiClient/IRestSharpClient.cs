namespace ApiHelper.ApiClient
{
    public interface IRestSharpClient
    {
        public void SetRestClient();
        public void SetRestRequest(RequestType type);
        public void SetRestResponse();
    }
}
