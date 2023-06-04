package UI.page;

import UI.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CafePage extends BasePage {
    @FindBy(xpath = "//img[@src='/image/468x318/39376.png']")
    public WebElement nationalKitBtn;

    @FindBy(xpath ="//div[@id='filter-range-slider']")
    public WebElement sliderBtn;

    @FindBy(xpath = "//div[@class='noUi-handle noUi-handle-upper']")
    public WebElement sliderMaxBtn;
}
