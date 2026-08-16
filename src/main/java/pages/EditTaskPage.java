package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditTaskPage {
    private AndroidDriver driver;

    public EditTaskPage(AndroidDriver driver){
        this.driver= driver;
    }

    //locators
    private By skipbtn = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/btn_skip");
    private By addtaskbtn = AppiumBy.accessibilityId("ADD NEW TASK >");
    private By Taskname = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_name");
    private By TaskDescription = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_description");
    private By savebtn = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/bt_process_task_ok");
    private By addedTaskName = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/tv_exlv_task_name");
    private By Actionbtn = AppiumBy.accessibilityId("Edit task");
    private By EditBtn = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(3)");












    //Actions

    public void ClickSkipbtn(){
        driver.findElement(skipbtn).click();
    }
    public void ClickAddtaskbtn(){
        driver.findElement(addtaskbtn).click();
    }
    public void fillTask(){
        driver.findElement(Taskname).sendKeys("Befor Edit task");
        driver.findElement(TaskDescription).sendKeys("here before edit");
    }

    public void ClickSavebtn(){
        driver.findElement(savebtn).click();
    }


    public String getTasknameInList(){

        return  driver.findElement(addedTaskName).getText();
    }
    public void ClickActionbtn(){
        driver.findElement(Actionbtn).click();
    }
    public void ClickEditbtn(){
        driver.findElement(EditBtn).click();
    }


    public void filleditTask(){
        driver.findElement(Taskname).sendKeys("After Edit task");
        driver.findElement(TaskDescription).sendKeys("here After edit");
    }

    public void ClickEditSavebtn(){
        driver.findElement(savebtn).click();
    }


    public String getmodifedTasknameInList(){

        return  driver.findElement(addedTaskName).getText();
    }

    }




