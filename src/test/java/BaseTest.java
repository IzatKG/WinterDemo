import UI.dataProvider.ConfigReader;
import UI.driverfactory.Driver;
import UI.helper.WebElementActions;
import UI.page.CafePage;
import UI.page.TitlePage;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
@Slf4j
public abstract class BaseTest {
   public CafePage cafePage;

    public TitlePage titlePage;
    public   WebDriver driver;
    public WebElementActions webElementActions;
    @BeforeClass
    public void setUp(){
        log.info("Start UI TESTS");
        titlePage=new TitlePage();
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("url"));
        webElementActions =new WebElementActions();
        cafePage=new CafePage();

    }
//    @AfterClass
//    public void tearDown(){
//        log.info("Finish UI TESTS");
//        Driver.closeDriver();
//    }



}
