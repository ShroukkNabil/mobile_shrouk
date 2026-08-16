package testcases;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditTask extends BaseTest {
    @Test
    public void edittask() throws InterruptedException {
       
        Thread.sleep(2000);


        BaseTest.editTaskPage.ClickSkipbtn();
        BaseTest.editTaskPage.ClickAddtaskbtn();
        BaseTest.editTaskPage.fillTask();
        BaseTest.editTaskPage.ClickSavebtn();

        String ExpectedTaskName= "Befor Edit task";
        String actualName= BaseTest.editTaskPage.getTasknameInList();
        Assert.assertEquals(actualName,ExpectedTaskName, "mismatch task name");
        BaseTest.editTaskPage.ClickActionbtn();
        BaseTest.editTaskPage.ClickEditbtn();



        BaseTest.editTaskPage.filleditTask();
        BaseTest.editTaskPage.ClickEditSavebtn();

        String ExpectededitedTaskName= "After Edit task";
        String actualeditedName= BaseTest.editTaskPage.getTasknameInList();
        Assert.assertEquals(actualName,ExpectedTaskName, "mismatch task name");


    }

}