package pages.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage extends HomePage {
    By figure1 = By.cssSelector(".figure:nth-child(3)");
    By figure2 = By.cssSelector(".figure:nth-child(4)");
    By figure3 = By.cssSelector(".figure:nth-child(5)");
    By figureHoverUserName = By.cssSelector(".figure:hover .figcaption > h5");

    public void hoverOverFigure(String figure) {
        WebElement hoverOverFigureElement = null;
        switch (figure) {
            case "figure1":
                hoverOverFigureElement = driver.findElement(figure1);
                break;
            case "figure2":
                hoverOverFigureElement = driver.findElement(figure2);
                break;
            case "figure3":
                hoverOverFigureElement = driver.findElement(figure3);
            default:
        }

        Actions action = new Actions(driver);
        action.moveToElement(hoverOverFigureElement).perform();
    }
    public String getFigureHoverUserName(){
        WebElement figureHoverUserNameElement = driver.findElement(figureHoverUserName);
      return figureHoverUserNameElement.getText();
    }
}
