package testcases;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FilterCompleteTask extends BaseTest {
    @Test
    public void filtercomplete() throws InterruptedException {
       // task1
        Thread.sleep(2000);
        BaseTest.filterCompletePage.ClickSkipbtn();
        BaseTest.filterCompletePage.ClickAddtaskbtn();
        BaseTest.filterCompletePage.fillTaskDetails("without mark" , "test mark filter");
        BaseTest.filterCompletePage.ClickSavebtn();

        String ExpectedTaskName="without mark";
        String actualName= BaseTest.filterCompletePage.getTasknameByIndex(1);
        Assert.assertEquals(actualName,ExpectedTaskName, "mismatch task name");


        // task2
        BaseTest.filterCompletePage.ClickAddtask2btn();
        BaseTest.filterCompletePage.fillTaskDetails("first_marked_task", "test mark filter");
        BaseTest.filterCompletePage.ClickSavebtn2();

        String ExpectedTaskName2="first_marked_task";
        String actualtaskName2= BaseTest.filterCompletePage.getTasknameByIndex(2);
        Assert.assertEquals(actualtaskName2,ExpectedTaskName2, "mismatch task name");
        //mark task
       // driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/cb_task_done")).click();
        BaseTest.filterCompletePage.checkTaskByName("first_marked_task");
        // Message displayed
        Assert.assertEquals(BaseTest.filterCompletePage.snackbarMsg(), "Task changed status");

         Thread.sleep(5000);

        //task3
        BaseTest.filterCompletePage.ClickAddtask3btn();
        BaseTest.filterCompletePage.fillTaskDetails("secound marked task", "test mark filter");
        BaseTest.filterCompletePage.ClickSavebtn3();

        String ExpectedTask3Name="secound marked task";
        String actualtask3Name= BaseTest.filterCompletePage.getTasknameByIndex(3);
        Assert.assertEquals(actualtask3Name,ExpectedTask3Name, "mismatch task name");
        //mark task
        // driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/cb_task_done")).click();
        BaseTest.filterCompletePage.checkTaskByName("secound marked task");
        // Message displayed
        Assert.assertEquals(BaseTest.filterCompletePage.snackbarMsg(), "Task changed status");


        //
        BaseTest.filterCompletePage.ClickMoreOptions();
        BaseTest.filterCompletePage.ClickCompletefilter();

    }
}
