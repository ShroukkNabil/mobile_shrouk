package testcases;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MarkTask extends BaseTest {
    @Test
    public void marktask() throws InterruptedException {
        //  Click skip
        Thread.sleep(2000);
        BaseTest.markTaskPage.ClickSkipbtn();
        BaseTest.markTaskPage.ClickAddtaskbtn();
        BaseTest.markTaskPage.fillTask();
        BaseTest.markTaskPage.ClickSavebtn();

        String ExpectedTaskName="MarkTask_Testcase";
        String actualName= BaseTest.markTaskPage.getTasknameInList();
        Assert.assertEquals(actualName,ExpectedTaskName, "mismatch task name");


        // // //mark task
        //driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/cb_task_done")).click();
        BaseTest.markTaskPage.checkTaskByName("MarkTask_Testcase");

        // Message displayed
        Assert.assertEquals(BaseTest.markTaskPage.snackbarMsg(), "Task changed status");

    }
}