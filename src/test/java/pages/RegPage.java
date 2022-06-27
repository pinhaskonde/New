package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage extends PageBase {
    public RegPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='tab-steps-counter']")
    WebElement pageCount;
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstname;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastname;
    @FindBy(xpath = "//input[@id='personalId']")
    WebElement personalId;
    @FindBy(xpath = "//input[@id='phone']")
    WebElement phone;
    @FindBy(xpath = "//input[@id='dateOfBirth']")
    WebElement dateOfBirth;

    @FindBy(css = ".gender.male.h5.col-4.py-2.px-0.box-select")
    WebElement genderMale;
    @FindBy(css = ".gender.female.h5.col-4.py-2.px-0.box-select")
    WebElement genderFemale;
    @FindBy(css = ".gender.other.h5.col-4.py-2.px-0.box-select")
    WebElement genderOther;

    @FindBy(xpath = "//input[@id='agreeTerms']")
    WebElement agreeTerms;

    @FindBy(css = ".button-big.button-active")
    WebElement buttonActive;

    public WebElement getButtonActive() {
        return buttonActive;
    }

    public RegPage fillFirstname(String name) {
        firstname.click();
        firstname.clear();
        firstname.sendKeys(name);
        return this;
    }

    public RegPage fillLastname(String lastName) {
        lastname.click();
        lastname.clear();
        lastname.sendKeys(lastName);
        return this;
    }

    public RegPage fillPersonalId(String id) {
        personalId.click();
        personalId.clear();
        personalId.sendKeys(id);
        return this;
    }

    public RegPage fillPhone(String phoneNumb) {
        phone.click();
        phone.clear();
        phone.sendKeys(phoneNumb);
        return this;
    }

    public RegPage fillDateOfBirth(String date) {
        dateOfBirth.click();
        dateOfBirth.clear();
        dateOfBirth.sendKeys(date);
        return this;
    }

    public RegPage fillGender(String gender) {
        String male = "Male";
        String female = "Female";
        String other = "Other";

        if (male.equalsIgnoreCase(gender)) {
            genderMale.click();
        } else if (male.equalsIgnoreCase(female)) {
            genderFemale.click();
        } else {
            genderOther.click();
        }
        return this;
    }

    public RegPage clickAgreeTermsCheckbox() {
        agreeTerms.click();
        return this;
    }

    public void clickButtonActive() {
        buttonActive.click();
    }

    public Integer getPageNumb() {
        String text = pageCount.getText();
        Character c = text.charAt(0);
        Integer a = Integer.parseInt(String.valueOf(c));
        return a;
    }

}
