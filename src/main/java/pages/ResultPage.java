package pages;

import org.openqa.selenium.By;

public class ResultPage extends PageObject {

    private By resultHeaderLabel = By.cssSelector("h1[data-rf-test-id='h1-header']");

    public String getResultHeaderLabelText(){
        return driver.findElement(resultHeaderLabel).getText();
    }
}
