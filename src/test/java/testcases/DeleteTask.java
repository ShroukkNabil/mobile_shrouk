package testcases;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DeleteTask extends BaseTest {
    @Test
    public void deletetask() throws InterruptedException {



        BaseTest.deleteTaskPage.ClickSkipbtn();
        BaseTest.deleteTaskPage.ClickAddtaskbtn();
        BaseTest.deleteTaskPage.fillTask();
        BaseTest.deleteTaskPage.ClickSavebtn();

        String ExpectedTaskName= "DeleteTask_testcase";
        String actualName= BaseTest.deleteTaskPage.getTasknameInList();
        Assert.assertEquals(actualName,ExpectedTaskName, "mismatch task name");
        BaseTest.deleteTaskPage.ClickActionbtn();
        BaseTest.deleteTaskPage.ClickRemovebtn();

        Assert.assertEquals(BaseTest.deleteTaskPage.snackbarMsg(), "Task successfully removed.");

    }}