package UI;

import UI.driverfactory.Driver;
import UI.helper.WebElementActions;
import UI.page.TitlePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver webDriver;
    public WebElementActions elementActions = new WebElementActions();
    public BasePage() { PageFactory.initElements(Driver.getDriver(), this );
    }
}
