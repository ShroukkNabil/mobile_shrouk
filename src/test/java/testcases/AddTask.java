package testcases;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTask extends BaseTest {
    @Test
    public void addtaskone() throws InterruptedException {

        BaseTest.addTaskPage.ClickSkipbtn();
        BaseTest.addTaskPage.ClickAddtaskbtn();
        BaseTest.addTaskPage.fillTask();
        BaseTest.addTaskPage.ClickSavebtn();

        String ExpectedTaskName= "Addtask_testcase";
        String actualName= BaseTest.addTaskPage.getTasknameInList();
        Assert.assertEquals(actualName,ExpectedTaskName, "mismatch task name");


    }
}