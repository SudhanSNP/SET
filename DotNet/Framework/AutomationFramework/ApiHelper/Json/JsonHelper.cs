using Newtonsoft.Json;

namespace ApiHelper.Json
{
    public class JsonHelper
    {
        public static async Task<T> JsonDeserializeAsync<T>(string response)
        {
            return JsonConvert.DeserializeObject<T>(response);
        }
    }
}
