using System.Configuration;

namespace Helpers.Configuration
{
    public static class ConfigurationSetting
    {
        public static string AssemblyPath;

        public static string GetValue(string key)
        {
            return ConfigurationManager.OpenExeConfiguration(AssemblyPath)
                .AppSettings.Settings[key].Value;
        }
    }
}
