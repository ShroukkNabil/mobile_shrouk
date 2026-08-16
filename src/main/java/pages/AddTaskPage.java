package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AddTaskPage {
    private AndroidDriver driver;

    public AddTaskPage(AndroidDriver driver){
        this.driver= driver;
    }

    //locators
    private By skipbtn = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/btn_skip");
    private By addtaskbtn = AppiumBy.accessibilityId("ADD NEW TASK >");
    private By Taskname = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_name");
    private By TaskDescription = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_description");
    private By savebtn = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/bt_process_task_ok");
    private By addedTaskName = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/tv_exlv_task_name");







    //Actions

    public void ClickSkipbtn(){
        driver.findElement(skipbtn).click();
    }
    public void ClickAddtaskbtn(){
        driver.findElement(addtaskbtn).click();
    }
    public void fillTask(){
        driver.findElement(Taskname).sendKeys("Addtask_testcase");
        driver.findElement(TaskDescription).sendKeys("testing create new task in my mobile automation project");
    }

    public void ClickSavebtn(){
        driver.findElement(savebtn).click();
    }

    public String getTaskname(){

        return  driver.findElement(Taskname).getText();
    }

    public String getTasknameInList(){

        return  driver.findElement(addedTaskName).getText();
    }


}
