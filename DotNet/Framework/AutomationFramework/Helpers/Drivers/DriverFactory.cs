using Helpers.Logging;

namespace Helpers.Drivers
{
    public class DriverFactory
    {
        public IDriver driver;
        private DriverType driverType;

        public DriverFactory(DriverType type)
        {
            driverType = type;
        }

        public IDriver GetDriverType()
        {
            driver = driverType switch
            {
                DriverType.Chrome => new Chrome(),
                DriverType.Edge => new Edge(),
                DriverType.Firefox => throw new NotImplementedException(),
                _ => throw new Exception("Enter the valid browser")
            };
         return driver;
        }
    }
}
