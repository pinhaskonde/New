package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage2 extends PageBase {

    public RegPage2(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='tab-steps-counter']")
    WebElement tabCounter;

    public WebElement getTabCounter() {
        return tabCounter;
    }

    public Integer getPageNumb() {
        String text = tabCounter.getText();
        Character c = text.charAt(0);
        Integer a = Integer.parseInt(String.valueOf(c));
        return a;
    }

}
