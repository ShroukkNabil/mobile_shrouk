package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class FilterCompletePage {
    private AndroidDriver driver;

    public FilterCompletePage (AndroidDriver driver){
        this.driver= driver;
    }

    //locatorsss









    // ميثود ذكية بتعمل Click على الـ Checkbox الخاص بأي مهمة بالاسم
    public void checkTaskByName(String taskName) {
        // بنستخدم XPath ديناميكي عشان نلاقي الـ Checkbox اللي جنب المهمة اللي اسمها taskName
        // ملاحظة: الـ ID ده مثال، استبدليه بالـ ID الحقيقي للـ Checkbox من الـ Inspector
        String checkboxXpath = "//android.widget.ExpandableListView[@resource-id='org.secuso.privacyfriendlytodolist:id/exlv_tasks']//android.view.ViewGroup[.//android.widget.TextView[@text='" + taskName + "']]//android.widget.CheckBox[@resource-id='org.secuso.privacyfriendlytodolist:id/cb_task_done']";

        driver.findElement(AppiumBy.xpath(checkboxXpath)).click();
    }
}


//android.widget.ExpandableListView[@resource-id="org.secuso.privacyfriendlytodolist:id/exlv_tasks"]/android.view.ViewGroup[2]/android.widget.CheckBox[@resource-id="org.secuso.privacyfriendlytodolist:id/cb_task_done"]
