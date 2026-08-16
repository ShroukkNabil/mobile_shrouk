package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FilterCompletePage {
    private AndroidDriver driver;

    public FilterCompletePage (AndroidDriver driver){
        this.driver= driver;
    }

    //locatorsss
    private By skipbtn = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/btn_skip");
    private By addtaskbtn = AppiumBy.accessibilityId("ADD NEW TASK >");
    private By Taskname = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_name");
    private By TaskDescription = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_description");
    private By savebtn = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/bt_process_task_ok");
    private By addedTaskName = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/tv_exlv_task_name");
    //private By addedTaskName2 = AppiumBy.xpath("//android.widget.TextView[@resource-id=org.secuso.privacyfriendlytodolist:id/tv_exlv_task_name");
    //private By addedTaskName3 = AppiumBy.xpath("//android.widget.TextView[@resource-id=org.secuso.privacyfriendlytodolist:id/tv_exlv_task_name");
    private By SnackbarMsg = AppiumBy.id("org.secuso.privacyfriendlytodolist:id/snackbar_text");
    private By Moreoption = AppiumBy.accessibilityId("More options");
    private By filtercomplete = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"org.secuso.privacyfriendlytodolist:id/title\" and @text=\"Completed tasks\"]");






    //Actions
    public void fillTaskDetails(String taskName, String taskDesc) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nameField = wait.until(ExpectedConditions.elementToBeClickable(Taskname));
        nameField.sendKeys(taskName);
        driver.findElement(TaskDescription).sendKeys(taskDesc);
    }

        public String getTasknameByIndex(int taskIndex) {
            String simpleXPath = "(//*[@resource-id='org.secuso.privacyfriendlytodolist:id/tv_exlv_task_name'])[" + taskIndex + "]";
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement taskElement = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath(simpleXPath)));
            return taskElement.getText();

    }
    //task1
    public void ClickSkipbtn(){
        driver.findElement(skipbtn).click();
    }
    public void ClickAddtaskbtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addtaskbtn));
        addButton.click();
      //  driver.findElement(addtaskbtn).click();
    }
    public void ClickSavebtn(){
        driver.findElement(savebtn).click();
    }



    //task2
    public void ClickAddtask2btn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addtaskbtn));
        addButton.click();
       // driver.findElement(addtaskbtn).click();
    }
    public void ClickSavebtn2(){
        driver.findElement(savebtn).click();
    }


    //task3
    public void ClickAddtask3btn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addtaskbtn));
        addButton.click();
       // driver.findElement(addtaskbtn).click();
    }
    public void ClickSavebtn3(){
        driver.findElement(savebtn).click();
    }





   //check mark
    public void checkTaskByName(String taskName) {
        String checkboxXpath = "//android.widget.ExpandableListView[@resource-id='org.secuso.privacyfriendlytodolist:id/exlv_tasks']//android.view.ViewGroup[.//android.widget.TextView[@text='" + taskName + "']]//android.widget.CheckBox[@resource-id='org.secuso.privacyfriendlytodolist:id/cb_task_done']";
        driver.findElement(AppiumBy.xpath(checkboxXpath)).click();

    }
    public String snackbarMsg() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement snackbar = wait.until(
                ExpectedConditions.visibilityOfElementLocated(SnackbarMsg));
        return  snackbar.getText();

    }
    public void ClickMoreOptions(){
        driver.findElement(Moreoption).click();
    }
    public void ClickCompletefilter(){
        driver.findElement(filtercomplete).click();
    }



}


