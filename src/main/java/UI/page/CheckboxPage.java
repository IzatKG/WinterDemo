package UI.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckboxPage {

    @FindBy(xpath = "//input[@class='form-check-input' and @type='checkbox']")
    public List<WebElement> allCheckboxes;
}
