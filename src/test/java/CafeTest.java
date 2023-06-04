import UI.driverfactory.Driver;
import io.qameta.allure.Description;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CafeTest extends BaseTest {

    @Test
    @Description("Verify that user can move slider on the Cafe page")
    public void checkSliderTest() {
        webElementActions.click(titlePage.foodButton);
        webElementActions.pause(3000);
        webElementActions.click(cafePage.nationalKitBtn);
        System.out.println(cafePage.sliderBtn.getLocation());
        System.out.println(cafePage.sliderBtn.getSize());
        webElementActions.pause(300);
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDropBy(cafePage.sliderBtn, 50, 0).perform();
        System.out.println(cafePage.sliderBtn.getLocation());
        System.out.println(cafePage.sliderBtn.getSize());

        System.out.println(cafePage.sliderMaxBtn.getLocation());
        actions.dragAndDropBy(cafePage.sliderMaxBtn, -200, 0).perform();
    }
}
