package pages.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends InternetBasePage {

    By checkboxes = By.cssSelector("#checkboxes>input");

    public void clickOnCheckbox(int index){
        List<WebElement>checkboxEle =driver.findElements(checkboxes);
        checkboxEle.get(index-1).click();
    }

    public boolean isCheckBoxSelected(int checkBoxIndex) {
        List<WebElement> checkboxEle = driver.findElements(checkboxes);
        return checkboxEle.get(checkBoxIndex - 1).isSelected();
    }
}
