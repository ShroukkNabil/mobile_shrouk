package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MarkTaskPage {
    private AndroidDriver driver;

    public MarkTaskPage (AndroidDriver driver){
        this.driver= driver;
    }
    private By skipbtn = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/btn_skip");
    private By addtaskbtn = AppiumBy.accessibilityId("ADD NEW TASK >");
    private By Taskname = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_name");
    private By TaskDescription = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_description");
    private By savebtn = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/bt_process_task_ok");
    private By addedTaskName = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/tv_exlv_task_name");
    private By SnackbarMsg = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/snackbar_text");



    //Actions

    public void ClickSkipbtn(){
        driver.findElement(skipbtn).click();
    }
    public void ClickAddtaskbtn(){
        driver.findElement(addtaskbtn).click();
    }
    public void fillTask(){
        driver.findElement(Taskname).sendKeys("MarkTask_Testcase");
        driver.findElement(TaskDescription).sendKeys("i will test checkbox");
    }

    public void ClickSavebtn(){
        driver.findElement(savebtn).click();
    }


    public String getTasknameInList(){

        return  driver.findElement(addedTaskName).getText();
    }


    public void checkTaskByName(String taskName) {
        String checkboxXpath = "//android.widget.ExpandableListView[@resource-id='org.secuso.privacyfriendlytodolist:id/exlv_tasks']//android.view.ViewGroup[.//android.widget.TextView[@text='" + taskName + "']]//android.widget.CheckBox[@resource-id='org.secuso.privacyfriendlytodolist:id/cb_task_done']";
        driver.findElement(AppiumBy.xpath(checkboxXpath)).click();
    }
    public String snackbarMsg() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement snackbar = wait.until(
                ExpectedConditions.visibilityOfElementLocated(SnackbarMsg));
        return  snackbar.getText();

    }



}

