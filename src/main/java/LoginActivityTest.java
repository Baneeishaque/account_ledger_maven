import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginActivityTest {

    private AndroidDriver<MobileElement> driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

//        {
//            "deviceName": "Honor 9 Lite",
//                "udid": "192.168.43.1:5555",
//                "platformName": "Android",
//                "platformVersion": "8.0",
//                "appPackage": "ndk.personal.account_ledger",
//                "appActivity": "ndk.personal.account_ledger.activities.Splash_v2"
//        }

        caps.setCapability("deviceName", "Honor 9 Lite");
        caps.setCapability("udid", "192.168.43.1:5555"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.0");
        caps.setCapability("skipUnlock", "true");
        caps.setCapability("appPackage", "ndk.personal.account_ledger");
        caps.setCapability("appActivity", "ndk.personal.account_ledger.activities.Splash_v2");
        caps.setCapability("noReset", "false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }


    @Test
    public void basicTest() {
//        //Click and pass Splash
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.id("com.isinolsun.app:id/animation_view"))).click();
//
//        //Click I am searching a job
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.id("com.isinolsun.app:id/bluecollar_type_button"))).click();
//
//
//        //Notification Allow
//        if (driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).size() > 0) {
//            driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).get(0).click();
//        }
//
//        //Elements
//        String secondNewJob = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/" +
//                "android.widget.RelativeLayout/android.widget.ImageView";
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.xpath(secondNewJob)));


    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
