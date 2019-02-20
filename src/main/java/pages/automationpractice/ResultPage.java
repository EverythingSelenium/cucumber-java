package pages.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultPage extends BasePage {

    private By resultHeaderLabel = By.cssSelector("h1[data-rf-test-id='h1-header']");

    public String getResultHeaderLabelText(){
        return driver.findElement(resultHeaderLabel).getText();
    }
}
