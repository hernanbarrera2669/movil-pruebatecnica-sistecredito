package co.com.sistecredito.utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumDriver {

  public static AndroidDriver<MobileElement> configuracion() throws MalformedURLException {
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("deviceName", "emulator-5554");
    caps.setCapability("udid", "emulator-5554");
    caps.setCapability("platformName", "android");
    caps.setCapability("platformVersion", "11.0");
    caps.setCapability("appPackage", "br.com.dafiti");
    caps.setCapability("appActivity", ".activity.SplashSelectCountry_");
    caps.setCapability("unicodeKeyBoard", true);
    caps.setCapability("resetKeyBoard", true);
    caps.setCapability("app", "");
    caps.setCapability("browserName", "");
    caps.setCapability("autoAcceptAlerts", true);

    return new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), caps);
  }

  private AppiumDriver() {}
}
