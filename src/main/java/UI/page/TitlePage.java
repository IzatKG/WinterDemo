package UI.page;

import UI.BasePage;
import UI.driverfactory.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TitlePage extends BasePage {

    @FindBy(xpath = "//img[@title='NambaFood']")
    public WebElement logoName;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "(//a[@href='/food'])[1]")
    public WebElement foodButton;

    @FindBy(xpath = "(//a[@href='/food'])[1]")
    public WebElement pharmacyButton;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    public WebElement searchBTN;

    @FindBy(xpath = "//a[contains(text(),'Еще')]")
    public WebElement menuLink;

    @FindBy(xpath = "//a[contains(text(),'Доставка')]")
    public WebElement deliveryBtn;

    public static void main(String[] args) {
        Driver.getDriver().get("https://nambafood.kg/");
    }
}