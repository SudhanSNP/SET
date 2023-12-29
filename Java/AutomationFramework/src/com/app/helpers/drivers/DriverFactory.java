package com.app.helpers.drivers;

public class DriverFactory {
    IDriver driver;
    DriverType driverType;

    public DriverFactory(DriverType type) {
        driverType = type;
    }

    public IDriver GetDriverType() throws Exception {
        driver = switch(driverType) {
            case Chrome -> new Chrome();
            case Edge -> new Edge();
            default -> throw new Exception("Please provide valid browser");
        };
        return driver;
    }
}
