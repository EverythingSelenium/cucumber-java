package pages.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends HomePage {
    By columnA = By.cssSelector("#column-a > header");
    By columnB = By.cssSelector("#column-b > header");


    public void dragAndDrop() {
        driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");

        //Element which needs to drag.
        WebElement source = driver.findElement(By.xpath("//*[@id='credit2']/a"));

        //Element on which need to drop.
        WebElement target = driver.findElement(By.xpath("//*[@id='bank']/li"));

        //Using Action class for drag and drop.
        Actions act = new Actions(driver);

        //Dragged and dropped.
        act.dragAndDrop(source, target).build().perform();
    }

    public void dragSourceToTarget(String source, String target) {

        WebElement sourceEle;
        WebElement targetEle;

        if(source.equalsIgnoreCase("A")) {
            sourceEle = driver.findElement(columnA);
            targetEle = driver.findElement(columnB);
        }else {
            targetEle = driver.findElement(columnA);
            sourceEle = driver.findElement(columnB);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(targetEle).click().build().perform();
        actions.dragAndDrop(sourceEle, targetEle).build().perform();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String getValueInColumnA(){
        return  driver.findElement(columnA).getText();

    }

    public String getValueInColumnB() {
        return  driver.findElement(columnB).getText();
    }
}
