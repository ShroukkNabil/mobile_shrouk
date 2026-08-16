package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public AndroidDriver driver;
    public static AddTaskPage addTaskPage;
    public static DeleteTaskPage deleteTaskPage;
    public static EditTaskPage editTaskPage;
   public static MarkTaskPage markTaskPage;
    public static FilterCompletePage filterCompletePage;


    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("Pixel 6");
        options.setApp("C:\\Users\\ASUS\\Downloads\\pfa-todo-list-release-v3.4.0.apk");
       options.setAppWaitActivity("*");
driver = new AndroidDriver(new URL(" http://127.0.0.1:4723/"), options);
        addTaskPage = new AddTaskPage(driver);
        deleteTaskPage= new DeleteTaskPage(driver);
        editTaskPage = new EditTaskPage(driver);
       markTaskPage = new MarkTaskPage(driver);
       // filterCompletePage = new FilterCompletePage(driver);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); //3shan lw al emliator khad wa2t fe t7mel ay 7aga ystna l7d ma tzhar
    }
}
