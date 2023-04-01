package utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hook {

    public static AppiumDriver<MobileElement> driver;

    @Before
    public void setUpAppium() throws Throwable {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "ZTE");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mibanco.bancamovil.qa");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mibanco.bancamovil.MainActivity");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        URL remoteAddress = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<>(remoteAddress, caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws IOException {
        driver.quit();
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }
}
