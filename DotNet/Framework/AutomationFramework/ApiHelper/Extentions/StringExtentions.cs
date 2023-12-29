namespace ApiHelper.Extentions
{
    public static class StringExtentions
    {
        public static string AppendBaseUrl(this string url, string subUrl)
        {
            url += "/" + subUrl;
            return url;
        }
    }
}
