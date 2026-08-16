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
       // add without mark
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/btn_skip")).click();
        driver.findElement(AppiumBy.accessibilityId("ADD NEW TASK >")).click();
        driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_name")).sendKeys("without mark");
        driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_description")).sendKeys("test mark filtter");
        driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/bt_process_task_ok")).click();
        Assert.assertTrue(driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/tv_exlv_task_name")).isDisplayed(), "Task was not added successfully!");


        // add with mark
        driver.findElement(AppiumBy.accessibilityId("ADD NEW TASK >")).click();
        driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_name")).sendKeys("Mark task");
        driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_description")).sendKeys("i will mark this task");
        driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/bt_process_task_ok")).click();
        Assert.assertTrue(driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/tv_exlv_task_name")).isDisplayed(), "Task was not added successfully!");
        //mark task
       // driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/cb_task_done")).click();
        BaseTest.filterCompletePage.checkTaskByName("Mark task");



        // Message displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement marksnackbar = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        AppiumBy.id("org.secuso.privacyfriendlytodolist:id/snackbar_text"))
        );
        Assert.assertTrue(marksnackbar.isDisplayed());



        //mark task2
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("ADD NEW TASK >")).click();
        driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_name")).sendKeys("Mark task2");
        driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/et_task_description")).sendKeys("i will mark this task");
        driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/bt_process_task_ok")).click();
        Assert.assertTrue(driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/tv_exlv_task_name")).isDisplayed(), "Task was not added successfully!");
        //mark task
        //driver.findElement(AppiumBy.id("org.secuso.privacyfriendlytodolist:id/cb_task_done")).click();
        BaseTest.filterCompletePage.checkTaskByName("Mark task2");

        // Message displayed
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement marksnackbar2 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        AppiumBy.id("org.secuso.privacyfriendlytodolist:id/snackbar_text"))
        );
        Assert.assertTrue(marksnackbar2.isDisplayed());


        //
        driver.findElement(AppiumBy.accessibilityId("More options")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"org.secuso.privacyfriendlytodolist:id/title\" and @text=\"Completed tasks\"]")).click();

    }
}
